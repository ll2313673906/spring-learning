package com.soft1851.spring.ioc.entity;

/**
 * @Author F*WT
 * @Date 2020/3/17 9:08
 * @Description
 */
public class Hello {
   public void sayHello(){
       System.out.println("hello");
   }
    public boolean isLogin(String account,String password){
        boolean flag = false;
        if ("admin".equals(account) && "111".equals(password)){
           flag = true;
        }
        return flag;
    }



}
