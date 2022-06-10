package com.accountbook.dao;

import com.accountbook.entity.Test;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestDao extends BaseMapper<Test> {
    List<Test> getAll();
}
