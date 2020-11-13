package com.ahut.server.service;

import com.ahut.server.dto.ChapterDTO;
import com.ahut.server.dto.PageDTO;

/**
 * @author hanzijian
 * @description:
 * @create 2020-11-12 22:37
 */
public interface ChapterService {
    void list(PageDTO<ChapterDTO> pageDTO);
}
