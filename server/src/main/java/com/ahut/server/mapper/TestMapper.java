package com.ahut.server.mapper;

import com.ahut.server.domain.Test;

import java.util.List;

public interface TestMapper {
    int deleteByPrimaryKey(String id);

    int insert(Test record);

    Test selectByPrimaryKey(String id);

    List<Test> selectAll();

    int updateByPrimaryKey(Test record);

    List<Test> list();
}