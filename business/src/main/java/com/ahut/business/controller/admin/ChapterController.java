package com.ahut.business.controller.admin;

import com.ahut.server.dto.ChapterDTO;
import com.ahut.server.service.ChapterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author hanzijian
 * @description:
 * @create 2020-11-09 20:49
 */
@RestController
@RequestMapping("/admin/chapter")
public class ChapterController {
    @Autowired
    private ChapterService chapterService;
    @GetMapping("/list")
    public List<ChapterDTO> chapter(){
        return chapterService.list();
    }
}
