package com.example.class3.resource;

import com.example.class3.model.Album;
import com.example.class3.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/albums")
public class AlbumResource {

    @Autowired
    private AlbumService albumService;


    @GetMapping
    public List<Album> getAlbums(){

        return albumService.getAlbums();
    }

    @PostMapping
    public void saveAlbum(@RequestBody Album album){
        albumService.saveAlbum(album);
    }

    @PutMapping("/{id}")
    public void editAlbum(@RequestBody Album album, @PathVariable("id") String id){

        album.setId(id);
        albumService.editAlbum(album);
    }

    //@DeleteMapping("/{id}")
    //public void deleteAlbum(@PathVariable("id") String id)){


        //albumService.deleteAlbum(id);
    //}
    //@DeleteMapping
    //public void deleteAlbum(String id){
        //albumService.deleteAlbum(id);
    //}
    @DeleteMapping("/{id}")
    public void deleteAlbum(@PathVariable("id") String id){
        albumService.deleteAlbum(id);
    }

}
