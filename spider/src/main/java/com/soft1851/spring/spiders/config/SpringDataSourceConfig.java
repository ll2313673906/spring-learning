package com.soft1851.spring.spiders.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@ComponentScan("com.soft1851.spring.spiders")
@PropertySource("classpath:jdbc.properties")
@EnableTransactionManagement
public class SpringDataSourceConfig {

   @Value("${jdbc.driverClassName}")
   private String driverClassName;

   @Value("${jdbc.url}")
   private String jdbcUrl;

   @Value("${jdbc.username}")
   private String username;

   @Value("${jdbc.password}")
   private String password;

   /**
    * 数据连接池地址配置
    * @return druidDataSource
    */
   @Bean
   public DruidDataSource druidDataSource(){
      DruidDataSource druidDataSource = new  DruidDataSource();
      druidDataSource.setDriverClassName(driverClassName);
      druidDataSource.setUrl(jdbcUrl);
      druidDataSource.setUsername(username);
      druidDataSource.setPassword(password);
      //配置初始化大小、最小、最大
      druidDataSource.setInitialSize(1);
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

   /**
    * jdbcTemplate模板配置
    * @param druidDataSource
    * @return
    */
   @Bean
   public JdbcTemplate jdbcTemplate(DruidDataSource druidDataSource){
      return new JdbcTemplate(druidDataSource);
   }

   /**
    * 装配事务管理
    * @param druidDataSource
    * @return
    */
   @Bean
   public DataSourceTransactionManager dataSourceTransactionManager(DruidDataSource druidDataSource){
      return new DataSourceTransactionManager(druidDataSource);
   }


//   /**
//    * 数据连接池地址配置
//    *
//    * @return druidDataSource
//    */
//   @Bean
//   public DruidDataSource druidDataSource() {
//      DruidDataSource druidDataSource = new DruidDataSource();
//      druidDataSource.setDriverClassName("com.mysql.jdbc.Driver");
//      druidDataSource.setUrl("jdbc:mysql://localhost:3306/bbs?useUnicode=true&characterEncoding=utf8&useSSL=false&autoReconnect=true");
//      druidDataSource.setUsername("root");
//      druidDataSource.setPassword("root");
//      return druidDataSource;
//   }

//   @Bean
//   public JdbcTemplate jdbcTemplate() {
//      return new JdbcTemplate(druidDataSource());
//   }
}
