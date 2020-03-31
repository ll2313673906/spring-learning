package com.soft1851.spring.mybatis.mapper;

import com.soft1851.spring.mybatis.entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;


/**
 * @Author F*WT
 * @Date 2020/3/31 14:46
 * @Description
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/spring-mybatis.xml"})
public class StudentMapperTest {
    @Resource
    private StudentMapper studentMapper;

    @Test
    public void insert() {
        Student student = Student.builder()
                .clazzId(1)
                .studentName("测试de学生")
                .hometown("南京")
                .birthday(LocalDate.of(2000,10,10))
                .build();
        studentMapper.insert(student);
        System.out.println(student.getStudentId());

    }

    @Test
    public void delete() {
        studentMapper.delete(2010);
    }

    @Test
    public void update() {
        Student student = Student.builder()
                .studentId(2011)
                .studentName("修改的学生")
                .hometown("南京")
                .birthday(LocalDate.of(2000,2,1))
                .build();
        studentMapper.update(student);
    }

    @Test
    public void batchInsert() {
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Student student = Student.builder()
                    .studentId(3000 + i)
                    .clazzId(1)
                    .studentName("批量增加" + i)
                    .hometown("江苏")
                    .birthday(LocalDate.of(2000,4,6))
                    .build();
            students.add(student);

        }
        int n = studentMapper.batchInsert(students);
        assertEquals(10, n);
    }


    @Test
    public void batchUpdate() {
        List<Student> studentList = new ArrayList<>();
        for (int i = 5;i < 7 ; i++){
            Student student = Student.builder()
                    .studentId(3000+i)
                    .studentName("测试333"+i)
                    .clazzId(3)
                    .build();
            studentList.add(student);
        }
        int n = studentMapper.batchUpdate(studentList);
        System.out.println(n);
    }

    @Test
    public void batchDelete() {
        List<Integer> studentList = new ArrayList<>();
        for (int i = 0;i < 3 ; i++){
            Student student = Student.builder()
                    .studentId(3000+i).build();
            studentList.add(student.getStudentId());
        }
        System.out.println(studentMapper.batchDelete(studentList));
    }

    @Test
    public void selectLimit() {
        System.out.println(studentMapper.selectLimit());

    }

    @Test
    public void selectLimitByDynamicSql() {
        System.out.println(studentMapper.selectLimitByDynamicSql(studentMapper.getStudentById(2008)));
    }


    @Test
    public void getStudentById() {
        Student student = studentMapper.getStudentById(2008);
        System.out.println(student);
    }
}


