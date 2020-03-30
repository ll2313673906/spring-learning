package com.soft1851.spring.spiders.service;

import com.soft1851.spring.spiders.config.SpringDataSourceConfig;
import com.soft1851.spring.spiders.entity.Topic;
import com.soft1851.spring.spiders.spider.JueJinSpider;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;


import javax.annotation.Resource;
import java.util.List;

import static org.junit.Assert.assertEquals;


/**
 * @Author F*WT
 * @Date 2020/3/27 11:41
 * @Description
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringDataSourceConfig.class})
@WebAppConfiguration("src/main/resources")//webAppConfiguration注解类默认为webApp目录，需要切换到src/main/resources目录
public class TopicServiceTest {

@Resource
private TopicService topicService;


    @Test
    public void addTopic() {
        Topic topic = Topic.builder()
                .id("1111")
                .topicName("Hello")
                .topicIcon("1.png")
                .description("test")
                .msgCount(111)
                .followersCount(111)
                .followed(true)
                .build();
        topicService.addTopic(topic);
    }


    @Test
    public void queryAll() {
        List<Topic> topics = topicService.queryAll();
        assertEquals(3,topics.size());
    }


    @Test
    public void batchInsert() {
        int[] ints = topicService.batchInsert(JueJinSpider.getTopics());
        assertEquals(JueJinSpider.getTopics().size(),ints.length);
        System.out.println(ints);
    }
}