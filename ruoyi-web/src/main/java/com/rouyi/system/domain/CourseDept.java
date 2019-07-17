package com.rouyi.sys.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 角色和部门关联表 sys_role_dept
 * 
 * @author ruoyi
 * @date 2019-07-16
 */
public class CourseDept extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 角色ID */
	private Long roleId;
	/** 部门ID */
	private Long deptId;

	public void setRoleId(Long roleId) 
	{
		this.roleId = roleId;
	}

	public Long getRoleId() 
	{
		return roleId;
	}
	public void setDeptId(Long deptId) 
	{
		this.deptId = deptId;
	}

	public Long getDeptId() 
	{
		return deptId;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("roleId", getRoleId())
            .append("deptId", getDeptId())
            .toString();
    }
}
