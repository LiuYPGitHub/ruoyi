package com.ruoyi.web.controller.system;

import com.ruoyi.common.core.domain.Ztree;
import com.ruoyi.system.domain.SysClassification;
import com.ruoyi.system.service.ISysClassificationService;
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
     * 加载课程列表树
     */
    @GetMapping("/treeClassification")
    @ResponseBody
    public List<Ztree> treeClassification() {
        List<Ztree> ztrees = iSysClassificationService.selectClassificationTree(new SysClassification());
        return ztrees;
    }

}
