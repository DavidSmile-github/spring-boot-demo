package com.david.elasticsearch.controller;

import com.david.common.constant.Constant;
import com.david.elasticsearch.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0
 * @author: HongBo﹒Liu
 * @date: 2020/1/21 15:01
 */
@RestController
@RequestMapping("/test")
@Slf4j
public class TestController {

    @Autowired
    TestService testService;
    static {
        System.out.println("TestController init ");
    }

    @GetMapping
    public String test() {

        log.info("{} test {}", Constant.LINE_CON, Constant.LINE_CON);
        return testService.getGames();
    }
}
