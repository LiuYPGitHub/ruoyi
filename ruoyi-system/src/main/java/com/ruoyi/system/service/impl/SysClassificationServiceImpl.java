package com.ruoyi.system.service.impl;

import com.ruoyi.common.annotation.DataScope;
import com.ruoyi.common.core.domain.Ztree;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.system.domain.SysClassification;
import com.ruoyi.system.mapper.SysClassificationMapper;
import com.ruoyi.system.service.ISysClassificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 课程管理
 */
@Service
public class SysClassificationServiceImpl implements ISysClassificationService {

    @Autowired
    private SysClassificationMapper sysClassificationMapper;

    /**
     * 查课程
     */
    @Override
    @DataScope(tableAlias = "c")
    public List<SysClassification> selectClassificationList(SysClassification classification)
    {
        return sysClassificationMapper.selectSysClassificationList(classification);
    }

    /**
     * 查询课程理树
     */
    @Override
    @DataScope(tableAlias = "c")
    public List<Ztree> selectSysClassificationTree(SysClassification classification)
    {
        List<SysClassification> classificationList = sysClassificationMapper.selectSysClassificationTree(classification);
        return initZtree(classificationList);
    }

    /**
     * 对象转课程树
     * @param classificationList 课程列表
     * @return 树结构列表
     */
    public List<Ztree> initZtree(List<SysClassification> classificationList)
    {
        return initZtree(classificationList, null);
    }

    /**
     * 对象转部门树
     *
     * @param classificationListList 课程列表
     * @param roleDeptList 角色已存在菜单列表
     * @return 树结构列表
     */
    public List<Ztree> initZtree(List<SysClassification> classificationListList, List<String> roleDeptList)
    {
        List<Ztree> ztrees = new ArrayList<Ztree>();
        boolean isCheck = StringUtils.isNotNull(roleDeptList);
        for (SysClassification classification : classificationListList) {
            Ztree ztree = new Ztree();
            ztree.setId(classification.getTypeId());
            ztree.setName(classification.getTypeName());
            if (isCheck) {
                ztree.setChecked(roleDeptList.contains(classification.getTypeId() + classification.getTypeName()));
            }
            ztrees.add(ztree);
        }
        return ztrees;
    }
}
