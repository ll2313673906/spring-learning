package com.soft1851.spring.spiders.service.impl;

import com.soft1851.spring.spiders.dao.RankDao;
import com.soft1851.spring.spiders.entity.Rank;
import com.soft1851.spring.spiders.service.RankService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author F*WT
 * @Date 2020/3/28 16:38
 * @Description
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class RankServiceImpl implements RankService {
    @Resource
    private RankDao rankDao;
    @Override
    public List<Rank> queryAll() {
        return rankDao.selectAll();
    }

    @Override
    public void addRank(Rank rank) {
        rankDao.insert(rank);
    }
    @Override
    public int[] batchInsert(List<Rank> ranks) {
        return rankDao.batchInsert(ranks);
    }
}
