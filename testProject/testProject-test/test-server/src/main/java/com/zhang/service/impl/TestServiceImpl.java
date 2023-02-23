package com.zhang.service.impl;

import com.zhang.dao.TestDao;
import com.zhang.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestDao testDao;

    @Autowired
    private RedisTemplate redisTemplate;

    public String getString(String string) {
        String selectString = testDao.selectDB();
        if (string == null){
            throw  new NullPointerException();
        }
        return selectString + "---" + string;
    }

    public String getRedis(String key) {
        String value =(String) redisTemplate.opsForValue().get(key);
        System.out.println("value ------------------" + value);
        return value;
    }
}
