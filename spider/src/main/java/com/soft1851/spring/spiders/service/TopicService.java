package com.soft1851.spring.spiders.service;

import com.soft1851.spring.spiders.entity.Topic;

import java.util.List;

/**
 * @Author F*WT
 * @Date 2020/3/27 10:39
 * @Description
 */
public interface TopicService {
    /**
     * 查询所有
     * @return   List<Topic>
     */
    List<Topic> queryAll();

    /**
     * 新增Topic
     * @param topic
     */
    void addTopic(Topic topic);

    /**
     * 批量化插入
     * @param topics
     * @return
     */
    int[] batchInsert(List<Topic> topics);

}
