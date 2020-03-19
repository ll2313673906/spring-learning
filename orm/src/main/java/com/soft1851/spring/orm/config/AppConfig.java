package com.soft1851.spring.orm.config;



import com.soft1851.spring.orm.entity.Forum;

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
    public Forum forum(){
        return new Forum();
    }


}
