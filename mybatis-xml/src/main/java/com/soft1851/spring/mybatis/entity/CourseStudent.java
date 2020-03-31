package com.soft1851.spring.mybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author F*WT
 * @Date 2020/3/31 14:35
 * @Description
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CourseStudent {
    private Integer id;
    private Integer courseId;
    private Integer studentId;
}
