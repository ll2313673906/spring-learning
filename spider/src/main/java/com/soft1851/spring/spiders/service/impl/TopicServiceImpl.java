package com.soft1851.spring.spiders.service.impl;

import com.soft1851.spring.spiders.dao.TopicDao;
import com.soft1851.spring.spiders.entity.Topic;
import com.soft1851.spring.spiders.service.TopicService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author F*WT
 * @Date 2020/3/27 10:42
 * @Description
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class TopicServiceImpl implements TopicService {

    @Resource
    private TopicDao topicDao;
    @Override
    public List<Topic> queryAll() {
       return topicDao.selectAll();
    }

    @Override
    public void addTopic(Topic topic) {
        topicDao.insert(topic);
        int a = 1 / 0;

    }

    @Override
    public int[] batchInsert(List<Topic> topics) {
        return topicDao.batchInsert(topics);
    }
}
