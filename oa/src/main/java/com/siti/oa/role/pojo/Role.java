package com.siti.oa.role.pojo;

import java.util.Date;

import com.siti.oa.base.Base;

public class Role extends Base {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long roleId;
	private Integer roleType;
	private String roleName;
	private String roleInfo;

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
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

	public Role(Integer activeFlag, String createBy, Date createDate, String updateBy, Date updateDate, Long roleId,
			Integer roleType, String roleName, String roleInfo) {
		super(activeFlag, createBy, createDate, updateBy, updateDate);
		this.roleId = roleId;
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

	@Override
	public String toString() {
		return "Role [roleId=" + roleId + ", roleType=" + roleType + ", roleName=" + roleName + ", roleInfo=" + roleInfo
				+ ", activeFlag=" + super.getActiveFlag() + ", createBy=" + super.getCreateBy() + ", createDate="
				+ super.getCreateDate() + ", updateBy=" + super.getUpdateBy() + ", updateDate=" + super.getUpdateDate()
				+ "]";
	}

	public Role(Integer activeFlag, String createBy, Date createDate, String updateBy, Date updateDate) {
		super(activeFlag, createBy, createDate, updateBy, updateDate);
	}

	public Role() {
		super();
	}

}
