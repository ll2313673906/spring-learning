package com.soft1851.spring.ioc.app;

import com.soft1851.spring.ioc.dao.ForumDao;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;


/**
 * @Author F*WT
 * @Date 2020/3/19 8:38
 * @Description
 */
public class SpringDataSourceConfigTest {
    public static void main(String[] args) {
        // 生成基于注解配置的应用上下文
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringDataSourceConfigTest.class);
        // 手动开启扫包
        ctx.scan("com.soft1851.spring.ioc.config");
        JdbcTemplate jdbcTemplate = (JdbcTemplate) ctx.getBean("jdbcTemplate");
        System.out.println(jdbcTemplate);
        ForumDao forumDao = (ForumDao) ctx.getBean("forumDao");
        List<Forum> forums = forumDao.selectAll();
        System.out.println(forums);
    }
}
