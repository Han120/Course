package com.ahut.business.controller.admin;

import com.ahut.server.dto.ChapterDTO;
import com.ahut.server.dto.PageDTO;
import com.ahut.server.service.ChapterService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hanzijian
 * @description:
 * @create 2020-11-09 20:49
 */
@RestController
@RequestMapping("/admin/chapter")
public class ChapterController {
    private static final Logger LOGGER = LoggerFactory.getLogger(ChapterController.class);
    @Autowired
    private ChapterService chapterService;

    @PostMapping("/list")
    public PageDTO<ChapterDTO> chapter(@RequestBody PageDTO<ChapterDTO> pageDTO) {
        LOGGER.info("pageDTO: {} ", pageDTO.toString());
        chapterService.list(pageDTO);
        return pageDTO;
    }
}
