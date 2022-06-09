package com.accountbook.controller;

import com.accountbook.entity.TestEntity;
import com.accountbook.service.TestService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    private TestService testService;

    /**
     * 测试使用接口
     *
     * @return 随意返回值
     */
    @GetMapping("/test")
    public String test() {
        return "hello world";
    }

    @PostMapping("/testMybatis")
    public List<TestEntity> testMybatis(@RequestBody TestEntity testEntity) {
        QueryWrapper<TestEntity> queryWrapper = new QueryWrapper<>();
        Map<String,Object> testMap = JSON.parseObject(JSON.toJSONString(testEntity),new TypeReference<Map<String,Object>>(){
        });
        testMap.forEach(
                (k,v)->{
                    queryWrapper.eq(k,v);
                }
        );
        List<TestEntity> result = testService.list(queryWrapper);
        return result;
    }
}
