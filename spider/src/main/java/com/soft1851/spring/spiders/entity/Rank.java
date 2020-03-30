package com.soft1851.spring.spiders.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author F*WT
 * @Date 2020/3/28 15:54
 * @Description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Rank {
    private  Integer id;
    private  String title;
    private  String author;
    private  String pic;
    private  String duration;
}
