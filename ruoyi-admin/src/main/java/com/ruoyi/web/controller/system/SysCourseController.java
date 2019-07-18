package com.ruoyi.web.controller.system;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.system.domain.SysCourse;
import com.ruoyi.system.service.ISysCourseService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * 课程信息
 */
@Controller
@RequestMapping("/system/course")
public class SysCourseController extends BaseController
{
    private String prefix = "system/course";

    @Autowired
    private ISysCourseService courseService;

    @RequiresPermissions("system:course:view")
    @GetMapping()
    public String course()
    {
        return prefix + "/course";
    }

    /**
     * 查所有
     * @param course
     * @return
     */
    @RequiresPermissions("system:course:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SysCourse course)
    {
        startPage();
        List<SysCourse> list = courseService.selectCourseList(course);
        return getDataTable(list);
    }

    /**
     * 查出id
     */
    @GetMapping("/edit/{courseId}")
    public String edit(@PathVariable("courseId") Long courseId, ModelMap mmap)
    {
        mmap.put("course", courseService.selectCourseById(courseId));
        return prefix + "/edit";
    }

    @RequiresPermissions("system:course:listId")
    @PostMapping("/listId{courseId}")
    @ResponseBody
    public SysCourse listId(@PathVariable("courseId") SysCourse courseId)
    {
        List<SysCourse> list = courseService.selectId(courseId);
        return (SysCourse) list;
    }

}