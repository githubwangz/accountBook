package com.accountbook.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

    /**
     * 测试使用接口
     *
     * @return 随意返回值
     */
    @GetMapping("/test")
    public String test() {
        return "hello world";
    }
}
