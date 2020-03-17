package com.soft1851.spring.ioc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author F*WT
 * @Date 2020/3/17 13:56
 * @Description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private String name;
    private Double price;
}
