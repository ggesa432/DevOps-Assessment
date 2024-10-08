package com.example.userscrud.service;

import com.example.userscrud.entity.User;
import org.springframework.stereotype.Service;

import com.example.userscrud.entity.Post;
import com.example.userscrud.repository.PostRepository;
import com.example.userscrud.repository.UserRepository;

import lombok.AllArgsConstructor;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@AllArgsConstructor
public class PostServiceImpl implements PostService {

	private final PostRepository postRepository;

	@Override
	public Post createPost(Post post) {
		return postRepository.save(post);
	}


}
