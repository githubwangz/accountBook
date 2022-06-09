package com.accountbook.dao;

import com.accountbook.entity.TestEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface TestMapper extends BaseMapper<TestEntity> {
    TestEntity getById(String Id);
}
