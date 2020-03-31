package com.soft1851.spring.mybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author F*WT
 * @Date 2020/3/31 20:32
 * @Description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MatterVo {
    private String teacherName;
    private String clazzName;
    private String studentName;
    private String hometown;
    private String birthday;
}
