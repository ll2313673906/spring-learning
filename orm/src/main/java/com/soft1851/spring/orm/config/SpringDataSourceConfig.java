package com.soft1851.spring.orm.config;

import com.alibaba.druid.pool.DruidDataSource;

import com.soft1851.spring.orm.dao.ForumDao;
import com.soft1851.spring.orm.dao.impl.ForumDaoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;


/**
 * @Author F*WT
 * @Date 2020/3/19 8:28
 * @Description
 */
@Configuration
@ComponentScan("com.soft1851.spring.orm")
public class SpringDataSourceConfig {
    /**
     * 数据连接池地址配置
     * @return
     */
    @Bean
    public DruidDataSource druidDataSource(){
        DruidDataSource druidDataSource = new  DruidDataSource();
        druidDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        druidDataSource.setUrl("jdbc:mysql://localhost:3306/bbs?useUnicode=true&characterEncoding=utf8&useSSL=false&autoReconnect=true");
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("root");
        //配置初始化大小、最小、最大
        druidDataSource.setInitialSize(8);
        druidDataSource.setMinIdle(1);
        druidDataSource.setMaxActive(20);
        //配置获取连接等待超时的时间
        druidDataSource.setMaxWait(60000);
        //配置间隔多久进行一次检测，检测需要关闭的空间连接，单位是毫秒
        druidDataSource.setTimeBetweenEvictionRunsMillis(60000);
        //配置一个连接在池中最小生成的时间，单位是毫秒
        druidDataSource.setMinEvictableIdleTimeMillis(300000);
        //禁止自动提交，实现事务管理
        druidDataSource.setDefaultAutoCommit(false);
        //设置连接池启用预处理事务集
        druidDataSource.setPoolPreparedStatements(true);
        return druidDataSource;
    }
    @Bean
    public JdbcTemplate jdbcTemplate(DruidDataSource druidDataSource){
        return new   JdbcTemplate(druidDataSource);
    }
    @Bean
    public ForumDao forumDao(JdbcTemplate jdbcTemplate) {
        return new ForumDaoImpl(jdbcTemplate);
    }


}
