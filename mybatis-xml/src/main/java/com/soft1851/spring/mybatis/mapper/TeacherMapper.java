package com.soft1851.spring.mybatis.mapper;

import com.soft1851.spring.mybatis.entity.Teacher;

/**
 * @Author F*WT
 * @Date 2020/3/31 20:17
 * @Description
 */
public interface TeacherMapper {
    /**
     * 根据teacherId一一对应关联查询其他管理的班级信息
     * @param teacherId
     * @return
     */
    Teacher getTeacherOneToOne(int teacherId);
}
