package com.soft1851.spring.ioc.entity;

import java.util.List;

/**
 * @Author F*WT
 * @Date 2020/3/17 9:46
 * @Description
 */
public class Student {
    private Integer id;
    private String name;
    private List<String> phones;

    public Student() {

    }

    public Student(Integer id, String name, List<String> phones) {
        this.id = id;
        this.name = name;
        this.phones = phones;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPhones() {
        return phones;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phones=" + phones +
                '}';
    }
}
