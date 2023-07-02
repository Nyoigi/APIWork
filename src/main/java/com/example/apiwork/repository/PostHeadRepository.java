package com.example.apiwork.repository;

import com.example.apiwork.model.newBd.PostHead;
import org.springframework.data.repository.CrudRepository;

public interface PostHeadRepository extends CrudRepository<PostHead, Long> {

    PostHead findPostHeadByNamePost(String namePost);
}
