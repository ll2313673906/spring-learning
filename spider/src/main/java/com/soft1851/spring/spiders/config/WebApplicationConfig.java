package com.soft1851.spring.spiders.config;




import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * @Author F*WT
 * @Date 2020/3/24 10:33
 * @Description web应用配置替代之前的web.xml
 */
public class WebApplicationConfig implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        // 创建一个基于注解的Web应用的上下文配置对象，实现ApplicationConfigRegistry
        AnnotationConfigWebApplicationContext cxt = new AnnotationConfigWebApplicationContext();
        // 讲webMvcConfig的配置类注册进对象
        cxt.register(WebMvcConfig.class);
        // 设置servletContext
        cxt.setServletContext(servletContext);
        //刷新;
        cxt.refresh();
        // 配置ctx的映射规则的对象
        ServletRegistration.Dynamic registration = servletContext.addServlet("dispatcher",new DispatcherServlet(cxt));
        // 添加规则
        registration.addMapping("/");
        // 设置读servlet的启动优先级
        registration.setLoadOnStartup(1);
    }
}
