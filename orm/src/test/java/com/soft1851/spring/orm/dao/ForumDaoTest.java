package com.soft1851.spring.orm.dao;


import com.soft1851.spring.orm.config.SpringDataSourceConfig;
import com.soft1851.spring.orm.entity.Forum;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * @Author F*WT
 * @Date 2020/3/17 16:23
 * @Description
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringDataSourceConfig.class})
public class ForumDaoTest {
    @Autowired
    private ForumDao forumDao;
    @Test
    public void insert() {
        Forum forum = Forum.builder().forumName("测试论坛").build();
        int count = forumDao.insert(forum);
        assertEquals(1,count);

    }

    @Test
    public void batchInsert() {
        Forum[] forums = {Forum.builder().forumName("测试论坛1").build(),
                Forum.builder().forumName("测试论坛2").build(),
                Forum.builder().forumName("测试论坛3").build()
        };
        List<Forum> forumList = Arrays.asList(forums);
        int[] rows = forumDao.batchInsert(forumList);
        assertEquals(3,rows.length);
    }

    @Test
    public void delete() {
        int n = forumDao.delete(1);
        assertEquals(1,n);
    }

    @Test
    public void update() {
        Forum forum = forumDao.get(2);
        forum.setForumName("测试论坛修改的新名称");
        int n = forumDao.update(forum);
        assertEquals(1,n);
    }

    @Test
    public void get() {
        Forum forum = forumDao.get(2);
        assertNotNull(forum);
    }

    @Test
    public void selectAll() {
        List<Forum> forums = forumDao.selectAll();
        System.out.println(forums.size());
    }
}