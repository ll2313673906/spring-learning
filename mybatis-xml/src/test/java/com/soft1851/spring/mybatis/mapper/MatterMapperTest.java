package com.soft1851.spring.mybatis.mapper;

import com.soft1851.spring.mybatis.entity.MatterDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * @Author F*WT
 * @Date 2020/3/31 20:26
 * @Description
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/spring-mybatis.xml"})
public class MatterMapperTest {

    @Resource
    private MatterMapper matterMapper;

    @Test
    public void selectLimitFromTeacherInClassByDynamicSql() {
        MatterDto matterDto = MatterDto.builder().teacherName("许老师").clazzName("软件1851").studentName("陈").build();
        matterMapper.selectLimitFromTeacherInClassByDynamicSql(matterDto).forEach(System.out::println);
    }
}