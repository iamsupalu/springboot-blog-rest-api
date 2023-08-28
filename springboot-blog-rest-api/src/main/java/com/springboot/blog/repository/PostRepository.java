package com.springboot.blog.repository;

import com.springboot.blog.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
//    no need to add code because JpaRepository has all methods defined.
//    no need to annotate because JpaRepository has SimpleJavaRepository which is already annotated
    List<Post> findByCategoryId(Long categoryId);
}
