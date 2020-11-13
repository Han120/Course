package com.ahut.business.controller;

import com.ahut.server.domain.Chapter;
import com.ahut.server.service.ChapterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author hanzijian
 * @description:
 * @create 2020-11-09 20:49
 */
@RestController
public class ChapterController {
    @Autowired
    private ChapterService chapterService;
    @GetMapping("/chapter")
    public List<Chapter> chapter(){
        return chapterService.list();
    }
}
