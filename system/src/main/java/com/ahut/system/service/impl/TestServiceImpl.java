package com.ahut.system.service.impl;

import com.ahut.system.domain.Test;
import com.ahut.system.mapper.TestMapper;
import com.ahut.system.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author hanzijian
 * @description:
 * @create 2020-11-10 14:19
 */
@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private TestMapper testMapper;

    @Override
    public List<Test> list() {
        return testMapper.list();
    }
}
