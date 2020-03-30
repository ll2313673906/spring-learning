package com.soft1851.spring.web.controller.service.impl;

import com.soft1851.spring.web.controller.service.ForumService;
import com.soft1851.spring.web.controller.dao.ForumDao;
import com.soft1851.spring.web.controller.entity.Forum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author F*WT
 * @Date 2020/3/20 12:17
 * @Description
 */
@Service
public class ForumServiceImpl implements ForumService {


   @Autowired
   private ForumDao forumDao;
    @Override
    public List<Forum> selectAll() {
       return forumDao.selectAll();
    }

    @Override
    public int[] batchInsert(List<Forum> forums) {
        return forumDao.batchInsert(forums);
    }

    @Override
    public Forum get(int forumId) {
        return forumDao.get(forumId);
    }



    @Override
    public int delete(int forumId) {
        return forumDao.delete(forumId);
    }



}
