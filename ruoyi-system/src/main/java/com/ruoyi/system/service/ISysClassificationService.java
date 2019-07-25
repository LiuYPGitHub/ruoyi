package com.ruoyi.system.service;

import com.ruoyi.common.annotation.DataScope;
import com.ruoyi.common.core.domain.Ztree;
import com.ruoyi.system.domain.SysClassification;

import java.util.List;

/**
 * 课程
 */
public interface ISysClassificationService {

    /**
     * 查课程
     */
    List<SysClassification> selectClassificationList(SysClassification classification);

    /**
     * 查询课程树
     */
    @DataScope(tableAlias = "c")
    List<Ztree> selectSysClassificationTree(SysClassification classification);
}
