package com.soft1851.spring.annotation.controller;

import com.soft1851.spring.annotation.entity.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

/**
 * @Author F*WT
 * @Date 2020/3/24 10:32
 * @Description
 */
@Controller
public class HomeController {
  @GetMapping("/home")
    public String home(Model model){
      model.addAttribute("message","Hello Spring MVC~~");
    Book[] books = {
            new Book(1,"java","https://student-manage-ll.oss-cn-beijing.aliyuncs.com/img/timg%20%282%29.jpg"),
            new Book(2,"html","https://student-manage-ll.oss-cn-beijing.aliyuncs.com/img/timg%20%283%29.jpg"),
            new Book(3,"spring","https://student-manage-ll.oss-cn-beijing.aliyuncs.com/img/timg%20%283%29.jpg")
    };
    List<Book> bookList = Arrays.asList(books);
    model.addAttribute("bookList",bookList);
      return "templates/home";
  }
}
