package com.soft1851.spring.spiders.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author F*WT
 * @Date 2020/3/28 23:04
 * @Description
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class recommend {
private Integer id;
private String cover;
private String title;
private String description;
}
