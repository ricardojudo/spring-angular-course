import { Injectable } from '@angular/core';
import { Observable } from "rxjs/Observable";
import { of } from "rxjs/observable/of";


import { Post } from "../models/post";
import { POSTS } from "../mocks/mock-posts";
import { MessagesService } from "../services/messages.service";


@Injectable()
export class PostsService {

  posts:Post[] = POSTS

  constructor(private messageService:MessagesService) { }


  findAll(): Observable<Post[]>{
    //return POSTS;
    this.messageService.add("PostsService: retrieving posts")
    return of(this.posts);
  }

  findById(id:string): Observable<Post>{
    this.messageService.add("PostsService: Find by id "+ id)
    var index = this.posts.findIndex(p => p.id == id)
    var post = index < 0 ? null : this.posts[index]
    return of(post)
  }

  update(post: Post): Observable<any>{
    this.messageService.add("PostService: Update post")
    var index = this.posts.findIndex(p => p.id == post.id)
    if(index >= 0 ){
      this.posts[index] = post
    }
    return of(post)
  }

  create(post: Post):Observable<any>{
    this.posts.push(post)
    return of(post)
  }

  delete(id: string):Observable<any>{
    var index = this.posts.findIndex(p => p.id == id)
    this.posts.splice(index,1)
    return of(id)
  }

}
