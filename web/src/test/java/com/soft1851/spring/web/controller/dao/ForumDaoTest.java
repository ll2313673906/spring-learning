package com.soft1851.spring.web.controller.dao;

import com.soft1851.spring.web.controller.entity.Forum;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @Author F*WT
 * @Date 2020/3/20 12:22
 * @Description
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/applicationContext.xml"})
public class ForumDaoTest {

    @Autowired
    private ForumDao forumDao;

    @Test
    public void selectAll() {
        List<Forum> forumsList = forumDao.selectAll();
        System.out.println(forumsList);
    }

    @Test
    public void get() {
      Forum forum = forumDao.get(2);
      assertNotNull(forum);

    }

    @Test
    public void batchInsert() {
       Forum[] forums = {
               Forum.builder().forumName("批量增加").build(),
               Forum.builder().forumName("批量增加1").build(),
               Forum.builder().forumName("批量增加2").build(),
               Forum.builder().forumName("批量增加3").build(),
               Forum.builder().forumName("批量增加4").build(),
               Forum.builder().forumName("批量增加5").build(),
               Forum.builder().forumName("批量增加6").build(),

       };
       List<Forum> forumList = Arrays.asList(forums);
       int[] rows = forumDao.batchInsert(forumList);
        System.out.println(rows);
    }
}