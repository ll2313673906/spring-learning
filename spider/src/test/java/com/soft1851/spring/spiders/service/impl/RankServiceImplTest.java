package com.soft1851.spring.spiders.service.impl;

import com.soft1851.spring.spiders.config.SpringDataSourceConfig;
import com.soft1851.spring.spiders.service.RankService;
import com.soft1851.spring.spiders.spider.BiLiBiLiSpider;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * @Author F*WT
 * @Date 2020/3/28 16:39
 * @Description
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringDataSourceConfig.class})
public class RankServiceImplTest {
    @Resource
    private RankService rankService;
    @Test
    public void queryAll() {
        System.out.println(rankService.queryAll());
    }

    @Test
    public void addRank() {
    }

    @Test
    public void batchInsert() {
        int [] ints=rankService.batchInsert(BiLiBiLiSpider.getRanks());
        assertEquals(BiLiBiLiSpider.getRanks().size(),ints.length);
    }


}