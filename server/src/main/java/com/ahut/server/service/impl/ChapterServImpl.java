package com.ahut.server.service.impl;

import com.ahut.server.domain.Chapter;
import com.ahut.server.domain.ChapterExample;
import com.ahut.server.dto.ChapterDTO;
import com.ahut.server.mapper.ChapterMapper;
import com.ahut.server.service.ChapterService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hanzijian
 * @description:
 * @create 2020-11-12 22:40
 */
@Service
public class ChapterServImpl implements ChapterService {
    @Autowired
    private ChapterMapper chapterMapper;

    @Override
    public List<ChapterDTO> list() {
        PageHelper.startPage(1,2);
        ChapterExample chapterExample = new ChapterExample();
        chapterExample.setOrderByClause("id desc");
        List<Chapter> chapterList = chapterMapper.selectByExample(chapterExample);
        List<ChapterDTO> chapterDTOList = new ArrayList<>();
        for (Chapter chapter : chapterList) {
            ChapterDTO chapterDTO = new ChapterDTO();
            BeanUtils.copyProperties(chapter, chapterDTO);
            chapterDTOList.add(chapterDTO);
        }
        return chapterDTOList;
    }
}
