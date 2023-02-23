package com.zhang.dao;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface TestDao {

    @Select("select video_id from tb_user_video_log limit 0,1")
    String selectDB();

}
