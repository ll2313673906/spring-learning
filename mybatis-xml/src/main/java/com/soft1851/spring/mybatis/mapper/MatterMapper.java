package com.soft1851.spring.mybatis.mapper;

import com.soft1851.spring.mybatis.entity.MatterDto;
import com.soft1851.spring.mybatis.entity.MatterVo;
import com.soft1851.spring.mybatis.entity.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author F*WT
 * @Date 2020/3/31 20:24
 * @Description
 */
@Transactional(rollbackFor = Exception.class)
public interface MatterMapper {

    /**
     * 多表指定条件查询（结合动态SQL）
     * @param matterDto MatterDto
     * @return List<MatterVo>
     */
    List<MatterVo> selectLimitFromTeacherInClassByDynamicSql( MatterDto matterDto);

}
