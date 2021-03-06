package com.accountbook.controller;

import com.accountbook.common.ResultMsgEnum;
import com.accountbook.entity.Test;
import com.accountbook.service.TestService;
import com.accountbook.common.Result;
import com.accountbook.utils.MD5Util;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("test")
@Slf4j
public class TestController {

    @Autowired
    private TestService testService;

    /**
     * 测试使用接口
     *
     * @return 随意返回值
     */
    @GetMapping("/test")
    public Result<String> test() {
        String a = MD5Util.getStringMD5("123456");
        if (log.isErrorEnabled()){
            log.error("qingqiuchenggong");
        }
        return Result.error(ResultMsgEnum.FAIL.getCode(), ResultMsgEnum.FAIL.getMessage());
    }

    @PostMapping("/testMybatis")
    public List<Test> testMybatis(@RequestBody Test testEntity) {
        QueryWrapper<Test> queryWrapper = new QueryWrapper<>();
        Map<String, Object> testMap = JSON.parseObject(JSON.toJSONString(testEntity), new TypeReference<>() {
        });
        testMap.forEach(
                (k, v) -> {
                    queryWrapper.eq(k, v);
                }
        );
        List<Test> listResult = testService.list(queryWrapper);
        return listResult;
    }
}