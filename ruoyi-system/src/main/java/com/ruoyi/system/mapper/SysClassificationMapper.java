package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.SysClassification;

import java.util.List;

/**
 * 课程管理
 */
public interface SysClassificationMapper {

    /**
     * 查询课程管理数据
     * @param sysClassification
     * @return
     */
    List<SysClassification> selectSysClassificationList(SysClassification sysClassification);

    /**
     * tree初始化
     * @param sysClassification
     * @return
     */
    List<SysClassification> selectSysClassificationTree(SysClassification sysClassification);
}
