package com.example.MPTSait.repository;

import com.example.MPTSait.model.newBd.PostHead;
import org.springframework.data.repository.CrudRepository;

public interface PostHeadRepository extends CrudRepository<PostHead, Long> {

    PostHead findPostHeadByNamePost(String namePost);
}
