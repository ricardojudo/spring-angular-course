import { Component, OnInit } from '@angular/core';
import { Post } from "../models/post";
import { POSTS } from "../mocks/mock-posts";
import { PostsService } from "../services/posts.service";
import { MessagesService } from "../services/messages.service";

@Component({
  selector: 'app-post',
  templateUrl: './post.component.html',
  styleUrls: ['./post.component.css']
})
export class PostComponent implements OnInit {

  /*
  post: Post = {
      id: '1',
      title:'Other post',
      content:'Askjdal dsalkjdsalkjdsa wqkjewlkew'
    }
    */

  post: Post

  //posts:Post[] = POSTS
  posts: Post[]

  constructor(private postService: PostsService,
    private messagesService: MessagesService
  ) { }

  ngOnInit() {
    //this.posts = this.postService.findAll();
    this.postService.findAll().subscribe(posts =>{
      this.posts = posts
    })
  }

  show(post: Post){
    this.post = post;
  }

  delete(post: Post){
    this.postService.delete(post.id).subscribe(()=>{
      this.messagesService.add("Post was deleted")
    })
  }

}
