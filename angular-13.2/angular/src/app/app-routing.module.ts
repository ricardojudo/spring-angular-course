import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, Routes } from "@angular/router";
import { PostComponent } from "./post/post.component";
import { LandingComponent } from "./landing/landing.component";
import { SavePostComponent } from './save-post/save-post.component';

const routes: Routes=[
  {path: "", redirectTo: "/landing", pathMatch: 'full'},
  {path: "landing", component: LandingComponent},
  {path: "posts", component: PostComponent},
  {path: "posts/new", component: SavePostComponent},
  {path: "posts/:id/edit", component: SavePostComponent}
]

@NgModule({
  imports: [
    CommonModule,
    RouterModule.forRoot(routes)
  ],
  exports: [RouterModule],
  declarations: []
})


export class AppRoutingModule { }
