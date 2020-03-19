package com.soft1851.spring.orm.dao;

import com.soft1851.spring.orm.entity.Forum;

import java.util.List;

/**
 * @Author F*WT
 * @Date 2020/3/17 15:47
 * @Description
 */
public interface ForumDao {
    /**
     * 新增论坛
     * @param forum
     * @return
     */
    int insert(Forum forum);

    /**
     * 批量新增Forum
     * @param forums
     * @return
     */
    int[] batchInsert(List<Forum> forums);

    /**
     * 根据Id删除Forum
     * @param forumId
     * @return
     */
    int delete(int forumId);

    /**
     * 修改Forum
     * @param forum
     * @return
     */
    int update(Forum forum);

    /**
     * 根据Id查询Forum
     * @param forumId
     * @return
     */
    Forum get(int forumId);

    /**
     * 查询所有论坛的信息
     * @return
     */
    List<Forum> selectAll();


}
