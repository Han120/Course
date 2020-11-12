package com.ahut.business.controller;

import com.ahut.server.domain.Test;
import com.ahut.server.service.TestService;
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
public class TestController {
    @Autowired
    private TestService testService;
    @GetMapping("/test")
    public List<Test> test(){
        return testService.list();
    }
}
