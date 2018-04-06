import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from "@angular/forms";


import { AppComponent } from './app.component';
import { NavBarComponent } from './nav-bar/nav-bar.component';
import { PostComponent } from './post/post.component';
import { PostDetailsComponent } from './post-details/post-details.component';

import { PostsService } from "./services/posts.service";
import { MessagesComponent } from './messages/messages.component';
import { MessagesService } from './services/messages.service';
import { AppRoutingModule } from './app-routing.module';
import { LandingComponent } from './landing/landing.component';


@NgModule({
  declarations: [
    AppComponent,
    NavBarComponent,
    PostComponent,
    PostDetailsComponent,
    MessagesComponent,
    LandingComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule
  ],
  providers: [
    PostsService,
    MessagesService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
