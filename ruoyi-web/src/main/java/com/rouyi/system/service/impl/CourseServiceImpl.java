package com.rouyi.sys.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.RoleDeptMapper;
import com.ruoyi.system.domain.RoleDept;
import com.ruoyi.system.service.IRoleDeptService;
import com.ruoyi.common.core.text.Convert;

/**
 * 角色和部门关联 服务层实现
 * 
 * @author ruoyi
 * @date 2019-07-16
 */
@Service
public class CourseServiceImpl implements IRoleDeptService
{
	@Autowired
	private RoleDeptMapper roleDeptMapper;

	/**
     * 查询角色和部门关联信息
     * 
     * @param roleId 角色和部门关联ID
     * @return 角色和部门关联信息
     */
    @Override
	public RoleDept selectRoleDeptById(Long roleId)
	{
	    return roleDeptMapper.selectRoleDeptById(roleId);
	}
	
	/**
     * 查询角色和部门关联列表
     * 
     * @param roleDept 角色和部门关联信息
     * @return 角色和部门关联集合
     */
	@Override
	public List<RoleDept> selectRoleDeptList(RoleDept roleDept)
	{
	    return roleDeptMapper.selectRoleDeptList(roleDept);
	}
	
    /**
     * 新增角色和部门关联
     * 
     * @param roleDept 角色和部门关联信息
     * @return 结果
     */
	@Override
	public int insertRoleDept(RoleDept roleDept)
	{
	    return roleDeptMapper.insertRoleDept(roleDept);
	}
	
	/**
     * 修改角色和部门关联
     * 
     * @param roleDept 角色和部门关联信息
     * @return 结果
     */
	@Override
	public int updateRoleDept(RoleDept roleDept)
	{
	    return roleDeptMapper.updateRoleDept(roleDept);
	}

	/**
     * 删除角色和部门关联对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteRoleDeptByIds(String ids)
	{
		return roleDeptMapper.deleteRoleDeptByIds(Convert.toStrArray(ids));
	}
	
}
