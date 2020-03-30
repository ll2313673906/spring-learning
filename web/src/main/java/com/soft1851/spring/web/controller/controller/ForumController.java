package com.soft1851.spring.web.controller.controller;

import com.alibaba.fastjson.JSON;
import com.soft1851.spring.web.controller.entity.Forum;
import com.soft1851.spring.web.controller.service.ForumService;
import com.soft1851.spring.web.controller.util.ResponseObject;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * @Author F*WT
 * @Date 2020/3/20 13:17
 * @Description
 */
@RestController
@RequestMapping(value = "forum")
public class ForumController {
    @Autowired
    private ForumService forumService;

    @RequestMapping(value = "/list",produces = "application/json;charset=utf-8")
    public String getForums(){
        ResponseObject ro = new ResponseObject(1,"成功",forumService.selectAll());
        System.out.println(ro);

        return JSON.toJSONString(ro);

    }


    @RequestMapping(value = "/batchInsert",produces = "application/json;charset=utf-8")
    public String batchInsert(@RequestBody List<Forum> forumList){
        ResponseObject ro = new ResponseObject(1,"成功",forumService.batchInsert(forumList));
        return JSON.toJSONString(ro);
    }

    @RequestMapping(value = "/delete",produces = "application/json;charset=utf-8" )
    public String deleteForumById(@RequestParam int forumId){
        ResponseObject ro = new ResponseObject(1,"成功",forumService.delete(forumId));
        return JSON.toJSONString(ro);
    }

    @RequestMapping(value = "/get",produces = "application/json;charset=utf-8")
    public String getById(@RequestParam Integer forumId){
        ResponseObject ro = new ResponseObject(1,"成功",forumService.get(forumId));
        return JSON.toJSONString(ro);
    }



}
