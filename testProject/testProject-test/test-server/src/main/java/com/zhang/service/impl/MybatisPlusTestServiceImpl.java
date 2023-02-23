package com.zhang.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhang.dao.MybatisPlusTestMapper;
import com.zhang.pojo.TbVideoInfo;
import com.zhang.service.MybatisPlusTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MybatisPlusTestServiceImpl implements MybatisPlusTestService {

    @Autowired
    private MybatisPlusTestMapper mybatisPlusTestMapper;

    @Override
    public String getList() {
        //id小于2 tag为影视
        
        return mybatisPlusTestMapper.selectList(new QueryWrapper<TbVideoInfo>().lt("id", 2).eq("tag", "影视")).toString();

    }
}
