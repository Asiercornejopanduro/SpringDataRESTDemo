package com.acornejo.demo.repository;

import com.acornejo.demo.pojo.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "comments", path = "comments")
public interface CommentRepository extends MongoRepository<Comment, String> {
}
