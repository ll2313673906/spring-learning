package com.soft1851.spring.spiders.service;

import com.soft1851.spring.spiders.entity.Rank;

import java.util.List;

/**
 * @Author F*WT
 * @Date 2020/3/28 16:37
 * @Description
 */
public interface RankService {
    /**
     * 查询所有
     * @return
     */
    List<Rank> queryAll();

    /**
     * 新增单个
     * @param rank
     */
    void  addRank(Rank rank);

    /**
     * 批量增加
     * @param ranks
     * @return
     */

    int[] batchInsert(List<Rank> ranks);
}
