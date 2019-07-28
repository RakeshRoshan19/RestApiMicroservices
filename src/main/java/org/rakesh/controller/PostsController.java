package org.rakesh.controller;


import org.rakesh.entity.Post;
import org.rakesh.services.PostService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostsController {
	
	@RequestMapping("/posts")
	public List<Post> getPosts() {
		return (new PostService().getPosts());
	}
	
	@RequestMapping("/posts/{id}")
	public Post getPostByID(@PathVariable int id) {
		return new PostService().getPostByID(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/posts")
	public void addPost(@RequestBody Post listElement) {
		new PostService().addPost(listElement);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/posts/{id}")
	public void updatePost(@PathVariable int id, @RequestBody Post post) {
		new PostService().updatePost(id, post);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/posts/{id}")
	public void deletePost(@PathVariable int id) {
		new PostService().deletePost(id);
	}
	
}
