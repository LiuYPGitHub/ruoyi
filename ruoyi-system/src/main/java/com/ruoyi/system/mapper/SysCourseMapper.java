package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.SysCourse;
import com.ruoyi.system.domain.SysUser;

import java.util.List;

/**
 * 用户表 数据层
 * 
 * @author ruoyi
 */
public interface SysCourseMapper
{
    List<SysCourse> selectCourseList(SysCourse course);
}
