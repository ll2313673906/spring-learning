package com.soft1851.spring.spiders.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author F*WT
 * @Date 2020/3/27 10:15
 * @Description Topic
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Topic {
    private String id;
    private String topicName;
    private String topicIcon;
    private String description;
    private Integer msgCount;
    private Integer followersCount;
    private Boolean followed;
}
