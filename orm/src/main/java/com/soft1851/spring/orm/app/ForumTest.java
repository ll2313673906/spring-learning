package com.soft1851.spring.orm.app;

import com.soft1851.spring.orm.config.AppConfig;
import com.soft1851.spring.orm.entity.Forum;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description TODO
 * @Author FWT
 * @Date 2020/3/17
 */
public class ForumTest {
    public static void main(String[] args) {
        //生成基于注解配置的应用上下文对象
        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(AppConfig.class);
        //scan手动扫包
        ctx.scan("com.soft1851.orm.config");
        Forum forum = (Forum) ctx.getBean("forum");
        forum.setForumId(2);
        forum.setForumName("刘恋");
        System.out.println(forum);
    }
}
