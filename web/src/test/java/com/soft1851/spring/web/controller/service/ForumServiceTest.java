package com.soft1851.spring.web.controller.service;

import com.soft1851.spring.web.controller.entity.Forum;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;
import java.util.List;



/**
 * @Author F*WT
 * @Date 2020/3/20 12:31
 * @Description
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/applicationContext.xml"})
public class ForumServiceTest {

    @Autowired
    private ForumService forumService;


    @Test
    public void selectAll() {
        List<Forum> forumList = forumService.selectAll();
        System.out.println(forumList);
    }


    @Test
    public void batchInsert() {
        Forum[] forums = {
                Forum.builder().forumName("hello").build()
        };
        List<Forum> forumList = Arrays.asList(forums);
        int[] rows = forumService.batchInsert(forumList);
        System.out.println(rows.length);
    }
}