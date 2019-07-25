package com.ruoyi.web.controller.system;

import com.ruoyi.common.core.domain.Ztree;
import com.ruoyi.system.domain.SysClassification;
import com.ruoyi.system.service.ISysClassificationService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 课程类别
 */
@Controller
@RequestMapping("/system/Classification")
public class SysClassificationController {

    @Autowired
    private ISysClassificationService  iSysClassificationService;

//    private String prefix = "/system/Classification";

    /**
     * 查课程
     */
    @RequiresPermissions("system:Classification:list")
    @GetMapping("/list")
    @ResponseBody
    public List<SysClassification> list(SysClassification classification)
    {
        List<SysClassification> classificationList = iSysClassificationService.selectClassificationList(classification);
        return classificationList;
    }

    /**
     * 加载课程列表树
     */
    @GetMapping("/treeClassification")
    @ResponseBody
    public List<Ztree> treeClassification() {
        return iSysClassificationService.selectSysClassificationTree(new SysClassification());
    }


}
