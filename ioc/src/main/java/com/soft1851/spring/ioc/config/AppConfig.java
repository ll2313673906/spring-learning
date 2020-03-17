package com.soft1851.spring.ioc.config;

import com.soft1851.spring.ioc.dao.PostDao;
import com.soft1851.spring.ioc.dao.impl.PostDaoImpl;
import com.soft1851.spring.ioc.entity.Book;
import com.soft1851.spring.ioc.entity.Post;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author F*WT
 * @Date 2020/3/17 14:01
 * @Description
 */
@Configuration
public class AppConfig {
    @Bean
    public Book book(){
        return new Book();
    }

    @Bean
    public Post post(){
        return new Post();
    }
    @Bean
    public PostDao postDao(){
        return new PostDaoImpl();
    }
}
