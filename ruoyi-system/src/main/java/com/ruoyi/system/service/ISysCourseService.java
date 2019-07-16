package com.ruoyi.system.service;

import com.ruoyi.system.domain.SysCourse;
import com.ruoyi.system.domain.SysUser;

import java.util.List;

/**
 * 用户 业务层
 * 
 * @author ruoyi
 */
public interface ISysCourseService
{
    /**
     * 查询课程列表
     */

    List<SysCourse> selectCourseList(SysCourse course);
}
