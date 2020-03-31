package com.soft1851.spring.mybatis.mapper;

import com.soft1851.spring.mybatis.entity.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author F*WT
 * @Date 2020/3/31 14:36
 * @Description
 */
@Transactional(rollbackFor = Exception.class)
public interface StudentMapper {
    /**
     * 新增student，并返回自增主键
     * @param student
     */
    void insert(Student student);

    /**
     * 根据studentId删除Student
     * @param studentId
     */
    void delete(int studentId);

    /**
     * 更新学生
     * @param student
     */
    void update(Student student);

    /**
     * 批量增加学生
     * @param students
     * @return
     */
    int batchInsert(@Param("students")List<Student> students);

    /**
     * 批量修改
     * @param students
     * @return
     */
    int batchUpdate(@Param("students")List<Student> students);

    /**
     * 批量删除
     * @param idList
     * @return
     */
    int batchDelete(@Param("idList") List<Integer> idList);

    /**
     * 单表（带两个指定条件） 查询
     * @return
     */
    List<Student> selectLimit();
    /**
     * 根据studentId查询Student
     * @param studentId int
     * @return Student
     */
    Student getStudentById(int studentId);

    /**
     * 单表指定条件查询（结合动态SQL）
     * @param student
     * @return
     */
    List<Student> selectLimitByDynamicSql(Student student);

}
