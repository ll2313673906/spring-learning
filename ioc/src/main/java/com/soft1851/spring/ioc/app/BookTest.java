package com.soft1851.spring.ioc.app;

import com.soft1851.spring.ioc.config.AppConfig;
import com.soft1851.spring.ioc.entity.Book;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author F*WT
 * @Date 2020/3/17 14:03
 * @Description
 */
public class BookTest {
    public static void main(String[] args) {
        // 生成基于注解配置的应用上下文对象
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        // 手动开启扫包
        ctx.scan("com.soft1851.spring.ioc.config");
        Book book = (Book) ctx.getBean("book");
        book.setName("java");
        book.setPrice(88.5);
        System.out.println(book);
    }
}
