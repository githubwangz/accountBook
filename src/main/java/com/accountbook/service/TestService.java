package com.accountbook.service;

import com.accountbook.entity.TestEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * (Test)表服务接口
 *
 * @author makejava
 * @since 2022-06-10 20:37:47
 */
public interface TestService extends IService<TestEntity> {

    List<TestEntity> getAll();

}