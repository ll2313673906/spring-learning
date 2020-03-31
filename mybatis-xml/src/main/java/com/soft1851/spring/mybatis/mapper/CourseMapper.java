package com.soft1851.spring.mybatis.mapper;

import com.soft1851.spring.mybatis.entity.Course;

/**
 * @Author F*WT
 * @Date 2020/3/31 20:29
 * @Description
 */
public interface CourseMapper {
    /**
     * 根据班课id查询班课详情（班课自身信息、学生列表）
     * @param courseId int
     * @return Course
     */
    Course getCourseById(int courseId);
}
