package com.example.demo.Repository;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Comment;


@Repository
public interface CommentRepository extends JpaRepository<Comment, UUID> {

	Comment save(Comment comment);

//	@AllowFiltering
	ArrayList<Comment> findAllByPostID(UUID postID);

}
