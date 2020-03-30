package com.soft1851.spring.annotation.entity;

import lombok.Data;


@Data
public class Topic {
    private Integer id;
    private String topicName;
    private String topicIcon;
    private Integer pins;
    private Integer follows;
}
