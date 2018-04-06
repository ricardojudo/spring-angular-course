import { Injectable } from '@angular/core';
import { Observable } from "rxjs/Observable";
import { of } from "rxjs/observable/of";


import { Post } from "../models/post";
import { POSTS } from "../mocks/mock-posts";
import { MessagesService } from "../services/messages.service";


@Injectable()
export class PostsService {



  constructor(private messageService:MessagesService) { }


  findAll(): Observable<Post[]>{
    //return POSTS;
    this.messageService.add("PostsService: retrieving posts")
    return of(POSTS);
  }

}
