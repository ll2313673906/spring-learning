#关于Spring的配置和注解的说明

## 1. 基于xml方式来做bean的配置
- <bean>标签的使用：id class
- 构造器注入：ref引用其他对象
- setter注入：p：简写形式

## 2. 两种方式可以获得xml中的bean
- ApplicationContext得到上下文，ac.getBean('''),main 方法使用
- @Autowired注解，单元测试中使用，

## 3. 基于java类来做bean的配置（主流）
- 配置类一定要加上@Configuration
- 配置中配置bean的方法，要加上@Bean注解

```
@Configuration
public class AppConfig {
    @Bean
    public Book book(){
        return new Book();
    }
}
``` 

## 4.如何在springFramework中获得Java类配置的bean
- main方法

```
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

```
- 单元测试
>  注意在xml配置文件中手动开启扫包的操作
```
 <context:component-scan base-package="com.soft1851.spring.ioc.config"/>
  
```