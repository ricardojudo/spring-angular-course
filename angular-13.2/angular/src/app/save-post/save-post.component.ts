import { Component, OnInit } from '@angular/core';
import { Location } from "@angular/common";
import { ActivatedRoute, Router } from "@angular/router";

import { Post } from "../models/post";
import { PostsService } from "../services/posts.service";
import { MessagesService } from "../services/messages.service";
import {  } from "module";

@Component({
  selector: 'app-save-post',
  templateUrl: './save-post.component.html',
  styleUrls: ['./save-post.component.css']
})
export class SavePostComponent implements OnInit {

  title:string = "New Post"
  post: Post = {
    id: '',
    title: ''
  }

  id: string

  constructor(
    private postService: PostsService, 
    private messageService: MessagesService,
    private router: Router,
    private location: Location,
    private activatedRoute: ActivatedRoute

  ) { }

  ngOnInit() {
    this.id=this.activatedRoute.snapshot.paramMap.get('id')
    if(this.id){
      this.title = "Update post"
      this.postService.findById(this.id).subscribe((post)=> this.post = post)
    }
  }

  save(){
    if(this.id){
      this.postService.update(this.post).subscribe(()=>{
        this.messageService.add('Post updated')
        this.router.navigate(['/posts'])
      })
    }else{
      this.postService.create(this.post).subscribe(()=>{
        this.messageService.add('Post created')
        this.router.navigate(['/posts'])
      })
    }
  }

  cancel(){
    this.messageService.add('Cancel post modification')
    this.location.back();
  }

}
