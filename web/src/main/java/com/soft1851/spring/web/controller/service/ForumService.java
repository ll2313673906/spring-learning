package com.soft1851.spring.web.controller.service;

import com.soft1851.spring.web.controller.entity.Forum;

import java.util.List;

/**
 * @Author F*WT
 * @Date 2020/3/20 12:13
 * @Description
 */
public interface ForumService {
    /**
     * 查询所有
     * @return
     */
    List<Forum> selectAll();

    /**
     * 批量增加
     * @param forums
     * @return
     */
    int[] batchInsert(List<Forum> forums);


    /**
     * 根据id查询Forum
     * @param forumId
     * @return Forum
     */
    Forum get(int forumId);


    /**
     * 根据id删除Forum
     * @param forumId
     * @return int
     */
    int delete(int forumId);




}
