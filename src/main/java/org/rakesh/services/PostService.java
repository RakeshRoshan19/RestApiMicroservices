package org.rakesh.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.rakesh.entity.Post;
import org.springframework.stereotype.Service;

@Service
public class PostService {

	static List<Post> posts = new ArrayList<>(
			Arrays.asList(
					new Post(1, "DataType1", "Sample Text1"),
					new Post(2, "DataType2", "Sample Text2"),
					new Post(3, "DataType3", "Sample Text3"),
					new Post(4, "DataType4", "Sample Text4"),
					new Post(5, "DataType5", "Sample Text5")
					
			));
	
	public List<Post> getPosts() {
		return posts;
	}

	public Post getPostByID(int id) {
		for (Post post: posts) {
			if (post.getPostId() == id) {
				return post;
			}
		}
		return null;
	}

	public void addPost(Post listElement) {
		posts.add(listElement);	
		return;
	}

	public void updatePost(int id, Post post) {
		for (int i = 0; i < posts.size(); i++) {
			if (posts.get(i).getPostId() == id) {
				posts.set(i, post);
			}
		}	
		return;
	}

	public void deletePost(int id) {
		for (int i = 0; i < posts.size(); i++) {
			if (posts.get(i).getPostId() == id) {
				posts.remove(i);
			}
		}
		return;
	}
}
