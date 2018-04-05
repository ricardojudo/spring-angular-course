package com.example.springboot.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.posts.Post;
import com.example.springboot.posts.PostService;

@RestController
@RequestMapping("/api/posts")
public class PostsController {

	@Autowired
	private PostService postService;

	@RequestMapping
	public List<Post> index() {
		return postService.getAll();
	}

	@RequestMapping("/{id}")
	public Post show(@PathVariable String id) {
		return postService.get(id);
	}

	@RequestMapping(method = RequestMethod.POST)
	public void create(@RequestBody Post post) {
		postService.create(post);
	}

	@RequestMapping(method = { RequestMethod.PUT, RequestMethod.PATCH }, value = "{id}")
	public void update(@PathVariable String id, @RequestBody Post post) {
		postService.update(id, post);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "{id}")
	public void delete(@PathVariable String id) {
		postService.delete(id);
	}

}
