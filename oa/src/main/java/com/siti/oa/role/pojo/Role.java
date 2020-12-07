package com.siti.oa.role.pojo;

import java.util.Date;

import com.siti.oa.base.Base;

public class Role extends Base {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long rowId;
	private Integer roleType;
	private String roleName;
	private String roleInfo;
	

	public Long getRowId() {
		return rowId;
	}

	public void setRowId(Long rowId) {
		this.rowId = rowId;
	}


	public Integer getRoleType() {
		return roleType;
	}

	public void setRoleType(Integer roleType) {
		this.roleType = roleType;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleInfo() {
		return roleInfo;
	}

	public void setRoleInfo(String roleInfo) {
		this.roleInfo = roleInfo;
	}

	public Role(Integer activeFlag, String createBy, Date createDate, String updateBy, Date updateDate, Long rowId,
			Integer roleType, String roleName, String roleInfo) {
		super(activeFlag, createBy, createDate, updateBy, updateDate);
		this.rowId = rowId;
		this.roleType = roleType;
		this.roleName = roleName;
		this.roleInfo = roleInfo;
	}

	public Role(Integer activeFlag, String createBy, Date createDate, String updateBy, Date updateDate,
			Integer roleType, String roleName, String roleInfo) {
		super(activeFlag, createBy, createDate, updateBy, updateDate);
		this.roleType = roleType;
		this.roleName = roleName;
		this.roleInfo = roleInfo;
	}


	public Role(Integer activeFlag, String createBy, Date createDate, String updateBy, Date updateDate) {
		super(activeFlag, createBy, createDate, updateBy, updateDate);
	}

	public Role() {
		super();
	}

	@Override
	public String toString() {
		return "Role [rowId=" + rowId + ", roleType=" + roleType + ", roleName=" + roleName + ", roleInfo=" + roleInfo
				+ ", toString()=" + super.toString() + "]";
	}

	public Role(String updateBy, Date updateDate, Long rowId,
			Integer roleType, String roleName, String roleInfo) {
		super(updateBy, updateDate);
		this.rowId = rowId;
		this.roleType = roleType;
		this.roleName = roleName;
		this.roleInfo = roleInfo;
	}

	
}
