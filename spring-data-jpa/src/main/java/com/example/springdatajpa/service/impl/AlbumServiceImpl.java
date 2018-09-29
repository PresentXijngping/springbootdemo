package com.example.springdatajpa.service.impl;

import com.example.springdatajpa.dao.AlbumRepositry;
import com.example.springdatajpa.entity.Album;
import com.example.springdatajpa.service.AlbumService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AlbumServiceImpl implements AlbumService {
    @Resource
    private AlbumRepositry albumRepositry;

    @Override
    public List<Album> getHotAlbums() {
        return albumRepositry.findHotAlbums();
    }
}
