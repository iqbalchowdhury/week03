package com.example.class3.repository;

import com.example.class3.model.Album;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlbumRepository extends MongoRepository<Album, String> {
    Album findByName(String s);
}
