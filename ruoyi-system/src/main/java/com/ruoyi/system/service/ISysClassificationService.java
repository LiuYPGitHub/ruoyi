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
     * 查询课程树
     * @return
     */
    @DataScope(tableAlias = "d")
    List<Ztree> selectClassificationTree(SysClassification classification);
}
