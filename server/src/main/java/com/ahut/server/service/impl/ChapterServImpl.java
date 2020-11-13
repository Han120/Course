package com.ahut.server.service.impl;

import com.ahut.server.domain.Chapter;
import com.ahut.server.domain.ChapterExample;
import com.ahut.server.mapper.ChapterMapper;
import com.ahut.server.service.ChapterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public List<Chapter> list() {
        ChapterExample chapterExample = new ChapterExample();
        chapterExample.setOrderByClause("id desc");
        return chapterMapper.selectByExample(chapterExample);
    }
}
