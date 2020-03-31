package com.soft1851.spring.mybatis.mapper;

import com.soft1851.spring.mybatis.entity.Clazz;
import com.soft1851.spring.mybatis.entity.ClazzVo;
import org.apache.ibatis.annotations.Mapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.List;



/**
 * @Author F*WT
 * @Date 2020/3/31 19:43
 * @Description
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/spring-mybatis.xml"})
public class ClazzMapperTest {
    @Resource
    private ClazzMapper mapper;
    @Test
    public void getClazzStudent() {
        List<ClazzVo> clazzVos = mapper.getClazzStudent(1);
        clazzVos.forEach(System.out::println);
    }
}