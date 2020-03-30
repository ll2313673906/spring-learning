package com.soft1851.spring.annotation.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author F*WT
 * @Date 2020/3/24 19:16
 * @Description
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Card {
    private Integer id;
    private String cardName;
    private String cardContent;
    private String cover;
}
