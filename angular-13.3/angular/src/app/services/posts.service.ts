import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from "@angular/common/http";

import { Observable } from "rxjs/Observable";
import { of } from "rxjs/observable/of";
import { catchError, map, tap } from "rxjs/operators";

import { environment } from "../../environments/environment";


import { Post } from "../models/post";
//import { POSTS } from "../mocks/mock-posts";
import { MessagesService } from "../services/messages.service";

const HOST_URL=environment.postsApiHost

@Injectable()
export class PostsService {

  //posts:Post[] = POSTS

  constructor(
    private messageService:MessagesService, 
    private httpClient: HttpClient) { }


  findAll(): Observable<Post[]>{
    //return POSTS;
    //this.messageService.add("PostsService: retrieving posts")
    //return this.httpClient.get<Post[]>( HOST_URL+"/api/posts")
    return this.httpClient.get<Post[]>(HOST_URL+"/api/posts").pipe(
      tap(_ => this.log(`Retrieving posts`)),
      catchError(this.handleError('Find all', []))
    )
  }

  findById(id:string): Observable<Post>{
    this.messageService.add("PostsService: Find by id "+ id)
    return this.httpClient.get<Post>( HOST_URL+"/api/posts/"+id).pipe(
      tap(_ => this.log(`Post ${id} found`)),
      catchError(this.handleError('Find by id', null))
    )
  }

  update(post: Post): Observable<any>{
    this.messageService.add("PostService: Update post")
    return this.httpClient.put<Post[]>( HOST_URL+"/api/posts/"+post.id,post).pipe(
      tap(_ => this.log(`Post ${post.id} updated`)),
      catchError(this.handleError('Update', post))
    )
  }

  create(post: Post):Observable<any>{
    return this.httpClient.post<Post[]>( HOST_URL+"/api/posts",post).pipe(
      tap(_ => this.log(`Post ${post.id} created`)),
      catchError(this.handleError('Create', post))
    )
  }

  delete(id: string):Observable<any>{
    return this.httpClient.delete<Post[]>( HOST_URL+"/api/posts/"+id).pipe(
      tap(_ => this.log(`Post ${id} deleted`)),
      catchError(this.handleError('Delete', id))
    )
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
