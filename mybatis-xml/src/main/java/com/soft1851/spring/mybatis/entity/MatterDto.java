package com.soft1851.spring.mybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author F*WT
 * @Date 2020/3/31 20:28
 * @Description
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MatterDto {
    private String teacherName;
    private String clazzName;
    private String studentName;
}
