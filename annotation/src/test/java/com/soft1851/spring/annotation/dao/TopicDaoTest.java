package com.soft1851.spring.annotation.dao;

import com.soft1851.spring.annotation.config.SpringDataSourceConfig;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;


/**
 * @Author F*WT
 * @Date 2020/3/26 10:18
 * @Description
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringDataSourceConfig.class})
@WebAppConfiguration("src/main/resources")//webAppConfiguration注解类默认为webApp目录，需要切换到src/main/resources目录

public class TopicDaoTest {

    @Autowired
    private TopicDao topicDao;
    @Test
    public void selectAll() {
        System.out.println(topicDao.selectAll());
    }
}