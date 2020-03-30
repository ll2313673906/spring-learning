package com.soft1851.spring.annotation.dao;

import com.soft1851.spring.annotation.entity.Topic;


import java.util.List;


public interface TopicDao {
    /**
     * 查询所有topic
     * @return list<Topic></>
     */
    List<Topic> selectAll();
}
