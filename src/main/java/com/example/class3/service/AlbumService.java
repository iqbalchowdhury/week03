package com.example.class3.service;

import com.example.class3.model.Album;
import com.example.class3.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumService {

    @Autowired
    private AlbumRepository albumRepository;

    public List<Album> getAlbums() {
        //todo
        return albumRepository.findAll();
        //return new ArrayList<>();
    }

    public void saveAlbum(Album album) {
        //todo
        albumRepository.save(album);

    }

    public void editAlbum(Album album) {
        //todo
        albumRepository.save(album);
    }

    public void deleteAlbum(String id) {
        //todo
        albumRepository.deleteById(id);
    }

}
