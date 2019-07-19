package com.ruoyi.system.service.impl;

import com.ruoyi.system.domain.*;
import com.ruoyi.system.mapper.*;
import com.ruoyi.system.service.ISysCourseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户 业务层处理
 * 
 * @author ruoyi
 */
@Service
public class SysCourseServiceImpl implements ISysCourseService
{
    private static final Logger log = LoggerFactory.getLogger(SysCourseServiceImpl.class);

    @Autowired
    private SysCourseMapper courseMapper;

    /**
     * 查询所有数据
     */
    @Override
    public List<SysCourse> selectCourseList(SysCourse course) {
        return courseMapper.selectCourseList(course);
    }

    /**
     * 通过ID查询
     * @return
     */
    @Override
    public SysCourse selectCourseById(Long courseId) {
        return courseMapper.selectCourseById(courseId);
    }
}
