package com.accountbook.service.impl;

import com.accountbook.dao.TestMapper;
import com.accountbook.entity.TestEntity;
import com.accountbook.service.TestService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, TestEntity> implements TestService {
    @Autowired
    private TestMapper testMapper;

    @Override
    public List<TestEntity> getAll() {
        return this.testMapper.getAll();
    }
}
