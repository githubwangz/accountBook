package com.accountbook.service.impl;

import com.accountbook.dao.TestDao;
import com.accountbook.pojo.Test;
import com.accountbook.service.TestService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl extends ServiceImpl<TestDao, Test> implements TestService {
    @Autowired
    private TestDao testMapper;

    @Override
    public List<Test> getAll() {
        return this.testMapper.getAll();
    }
}
