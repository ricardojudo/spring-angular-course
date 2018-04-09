import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from "@angular/common/http";

import { Observable } from "rxjs/Observable";
import { of } from "rxjs/observable/of";
import { catchError, map, tap } from "rxjs/operators";

import { environment } from "../../environments/environment";


import { Post } from "../models/post";
import { POSTS } from "../mocks/mock-posts";
import { MessagesService } from "../services/messages.service";

const HOST_URL="http://localhost:18080"

@Injectable()
export class PostsService {

  posts:Post[] = POSTS

  constructor(
    private messageService:MessagesService, 
    private httpClient: HttpClient) { }


  /*
   * Ajustar funciones para recuperar post mediante una llamada HTTP
   */
  findAll(): Observable<Post[]>{
    return of(this.posts)
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
  
  private log(message: string){
    this.messageService.add("PostService: " + message);
  }

  private handleError<T>(operation='operation', result?: T){
    return (error: any): Observable<T> => {
      console.error(error)
      this.log(`${operation} failed: ${error.message}`)
      return of(result as T)
    }
  }


}
