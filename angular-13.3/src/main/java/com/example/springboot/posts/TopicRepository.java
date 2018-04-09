package com.example.springboot.posts;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Post, String> {

}
