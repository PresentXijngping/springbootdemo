package com.example.springdatajpa.dao;

import com.example.springdatajpa.entity.Album;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AlbumRepositryTest {
    @Resource
    private AlbumRepositry albumRepositry;

    @Test
    public void initData() {
        Album[] albums = {
                new Album("https://goo.gl/E12vkg", "手绘", "本专题是绘画爱好者的乐园，欢迎互相分享学习", 210),
                new Album("https://goo.gl/8c1kzz", "旅行", "邂逅一个国家，讲述一座城市，这里有你期待的诗与远方。", 333),
                new Album("https://goo.gl/VLUQEk", "读书", "读书专题仅收录与读书有关的书评、读书笔记、阅读方法、读书清单等文章。", 1663),
                new Album("https://goo.gl/n8gPka", "生活", "内容原创、鼓励从生活中的自身经验发掘生活的美好与乐趣，鼓励图文并茂。", 523),
                new Album("https://goo.gl/mHLWcy", "编程", "有一颗喜欢写程序的心，喜欢分享技术干货、项目经验、程序员日常囧事", 2888),
                new Album("https://goo.gl/WkYnhp", "简爱", "据说在简书认真写作的人都可以在这里找到TA的灵魂伴侣。", 977)
        };
        for (int i = 0; i < 6; i++) {
            albumRepositry.save(albums[i]);
        }
    }

    @Test
    public void findHotAlbums() {
        List<Album> albumList = albumRepositry.findHotAlbums();
        albumList.forEach(album -> System.out.println(album));
    }
}