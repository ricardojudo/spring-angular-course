import { Component, OnInit } from '@angular/core';
import { Post } from "../models/post";
import { POSTS } from "../mocks/mock-posts";

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

  posts:Post[] = POSTS
  
  constructor() { }

  ngOnInit() {
  }

  show(post: Post){
    this.post = post;
  }

}
