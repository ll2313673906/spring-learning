package com.soft1851.spring.annotation.dao.impl;


import com.soft1851.spring.annotation.dao.TopicDao;
import com.soft1851.spring.annotation.entity.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TopicDaoImpl implements TopicDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public List<Topic> selectAll() {
        String sql ="SELECT * FROM t_topic";
        return jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Topic.class));
    }
}
