package com.example.springboot.posts;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {
	
	@Autowired
	private TopicRepository repository;
	
	
	public List<Post> getAll(){
		ArrayList<Post> posts = new ArrayList<>();
		repository.findAll().forEach(posts::add);
		return posts;
	}
	
	
	public Post get(String id) {
		return repository.findById(id).get();
	}
	
	public void create(Post post) {
		repository.save(post);
	}
	
	public void update(String id, Post post) {
		post.setId(id);
		repository.save(post);
	}

	public void delete(String id) {
		repository.deleteById(id);
	}
	
	/*
	private static List<Post> posts = new ArrayList<>(
			Arrays.asList(new Post("1", "Spring Framework", "Spring Framework description"),
					new Post("2", "Chelas", "Este posto es acerca de chelas"),
					new Post("3", "Mas chelas", "Chelas hasta el Valhalla")));

	public List<Post> getAll() {
		return posts;
	}

	public Post get(String id) {
		return posts.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void create(Post post) {
		posts.add(post);
	}

	public void update(String id, Post post) {
		for(int i =0 ;i < posts.size(); i++) {
			Post t = posts.get(i);
			if(t.getId().equals(id)) {
				t.setId(id);
				posts.set(i, post);
				return;
			}
		};
	}

	public void delete(String id) {
		posts.removeIf((t) -> t.getId().equals(id));
	}
	*/
	
	
}
