package com.accountbook.service.serviceimpl;

import com.accountbook.entity.TestEntity;
import com.accountbook.dao.TestMapper;
import com.accountbook.service.TestService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, TestEntity> implements TestService {
}
