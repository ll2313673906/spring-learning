package com.soft1851.spring.spiders.dao;

import com.soft1851.spring.spiders.entity.Topic;

import java.util.List;

/**
 * @Author F*WT
 * @Date 2020/3/27 10:21
 * @Description
 */
public interface TopicDao {
    /**
     * 查询所有
     * @return  List<Topic>
     */
    List<Topic> selectAll();

    /**
     * 批量插入
     * @param topics
     * @return  int[]
     */
    int[] batchInsert(List<Topic> topics);

    /**
     * 新增一个
     * @param topic
     * @return int
     */
    int insert(Topic topic);

}
