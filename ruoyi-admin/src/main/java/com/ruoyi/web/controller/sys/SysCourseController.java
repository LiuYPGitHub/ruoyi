package com.ruoyi.web.controller.sys;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.system.domain.SysCourse;
import com.ruoyi.system.service.ISysCourseService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * 课程信息
 */
@Controller
@RequestMapping("/sys/user")
public class SysCourseController extends BaseController
{
    private String prefix = "sys/course";

    @Autowired
    private ISysCourseService courseService;

    @RequiresPermissions("sys:user:view")
    @GetMapping()
    public String user()
    {
        return prefix + "/course";
    }

    @RequiresPermissions("sys:course:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SysCourse courseId)
    {
        startPage();
        List<SysCourse> list = courseService.selectCourseList(courseId);
        return getDataTable(list);
    }
}