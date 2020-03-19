package com.soft1851.spring.web.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author F*WT
 * @Date 2020/3/19 15:10
 * @Description
 */
@RestController
public class HelloController {
    @RequestMapping(value = "/hello.do")
    public String getHello(){
        return "hello spring!!!!";
    }
}
