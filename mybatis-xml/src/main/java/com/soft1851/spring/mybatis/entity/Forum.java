package com.soft1851.spring.mybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author F*WT
 * @Date 2020/3/30 11:03
 * @Description
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Forum {
    private Integer forumId;
    private String forumName;
}
