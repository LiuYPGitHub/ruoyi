package com.rouyi.sys.controller;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.RoleDept;
import com.ruoyi.system.service.IRoleDeptService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;

/**
 * 角色和部门关联 信息操作处理
 * 
 * @author ruoyi
 * @date 2019-07-16
 */
@Controller
@RequestMapping("/system/roleDept")
public class CourseController extends BaseController
{
    private String prefix = "system/roleDept";
	
	@Autowired
	private IRoleDeptService roleDeptService;
	
	@RequiresPermissions("system:roleDept:view")
	@GetMapping()
	public String roleDept()
	{
	    return prefix + "/roleDept";
	}
	
	/**
	 * 查询角色和部门关联列表
	 */
	@RequiresPermissions("system:roleDept:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(RoleDept roleDept)
	{
		startPage();
        List<RoleDept> list = roleDeptService.selectRoleDeptList(roleDept);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出角色和部门关联列表
	 */
	@RequiresPermissions("system:roleDept:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(RoleDept roleDept)
    {
    	List<RoleDept> list = roleDeptService.selectRoleDeptList(roleDept);
        ExcelUtil<RoleDept> util = new ExcelUtil<RoleDept>(RoleDept.class);
        return util.exportExcel(list, "roleDept");
    }
	
	/**
	 * 新增角色和部门关联
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存角色和部门关联
	 */
	@RequiresPermissions("system:roleDept:add")
	@Log(title = "角色和部门关联", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(RoleDept roleDept)
	{		
		return toAjax(roleDeptService.insertRoleDept(roleDept));
	}

	/**
	 * 修改角色和部门关联
	 */
	@GetMapping("/edit/{roleId}")
	public String edit(@PathVariable("roleId") Long roleId, ModelMap mmap)
	{
		RoleDept roleDept = roleDeptService.selectRoleDeptById(roleId);
		mmap.put("roleDept", roleDept);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存角色和部门关联
	 */
	@RequiresPermissions("system:roleDept:edit")
	@Log(title = "角色和部门关联", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(RoleDept roleDept)
	{		
		return toAjax(roleDeptService.updateRoleDept(roleDept));
	}
	
	/**
	 * 删除角色和部门关联
	 */
	@RequiresPermissions("system:roleDept:remove")
	@Log(title = "角色和部门关联", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(roleDeptService.deleteRoleDeptByIds(ids));
	}
	
}
