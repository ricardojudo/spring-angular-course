import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, Routes } from "@angular/router";
import { PostComponent } from "./post/post.component";
import { LandingComponent } from "./landing/landing.component";

const routes: Routes=[
  {path: "", redirectTo: "/landing", pathMatch: 'full'},
  {path: "landing", component: LandingComponent},
  {path: "posts", component: PostComponent}
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
