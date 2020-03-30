package com.soft1851.spring.spiders.dao;

import com.soft1851.spring.spiders.entity.Rank;

import java.util.List;

/**
 * @Author F*WT
 * @Date 2020/3/28 16:31
 * @Description
 */
public interface RankDao {
    /**
     * 搜索全部
     * @return
     */
    List<Rank> selectAll();

    /**
     * 批量插入
     * @param ranks
     * @return
     */
    int [] batchInsert(List<Rank> ranks);

    /**
     * 新增单个
     * @param
     * @return
     */
    int insert(Rank rank);
}
