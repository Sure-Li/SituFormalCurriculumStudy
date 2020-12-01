package com.situ.eoms.pojo;

import java.io.Serializable;
import java.util.Date;

public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long rowId;
	private Long empDepId;
	private Long empId;
	private String empPassword;
	private String empName;
	private Date empJoinTime;
	private int empLevel;
	private int activeFlag;
	private String createBy;
	private Date createDate;
	private String updateBy;
	private Date updateDate;
	/**
	 * 添加外用部分开始
	 */
	private String empDepName;
	
	public String getEmpDepName() {
		return empDepName;
	}

	public void setEmpDepName(String empDepName) {
		this.empDepName = empDepName;
	}

	public Employee(Long rowId, Long empDepId, Long empId, String empPassword, String empName, Date empJoinTime,
			int empLevel, int activeFlag, String createBy, Date createDate, String updateBy, Date updateDate,
			String empDepName) {
		super();
		this.rowId = rowId;
		this.empDepId = empDepId;
		this.empId = empId;
		this.empPassword = empPassword;
		this.empName = empName;
		this.empJoinTime = empJoinTime;
		this.empLevel = empLevel;
		this.activeFlag = activeFlag;
		this.createBy = createBy;
		this.createDate = createDate;
		this.updateBy = updateBy;
		this.updateDate = updateDate;
		this.empDepName = empDepName;
	}

	/**
	 * 添加外用部分结束
	 */

	public Long getRowId() {
		return rowId;
	}

	public void setRowId(Long rowId) {
		this.rowId = rowId;
	}

	public Long getEmpDepId() {
		return empDepId;
	}

	public void setEmpDepId(Long empDepId) {
		this.empDepId = empDepId;
	}

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getEmpPassword() {
		return empPassword;
	}

	public void setEmpPassword(String empPassword) {
		this.empPassword = empPassword;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Date getEmpJoinTime() {
		return empJoinTime;
	}

	public void setEmpJoinTime(Date empJoinTime) {
		this.empJoinTime = empJoinTime;
	}

	public int getEmpLevel() {
		return empLevel;
	}

	public void setEmpLevel(int empLevel) {
		this.empLevel = empLevel;
	}

	public int getActiveFlag() {
		return activeFlag;
	}

	public void setActiveFlag(int activeFlag) {
		this.activeFlag = activeFlag;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public Employee(Long rowId, Long empDepId, Long empId, String empPassword, String empName, Date empJoinTime,
			int empLevel, int activeFlag, String createBy, Date createDate, String updateBy, Date updateDate) {
		super();
		this.rowId = rowId;
		this.empDepId = empDepId;
		this.empId = empId;
		this.empPassword = empPassword;
		this.empName = empName;
		this.empJoinTime = empJoinTime;
		this.empLevel = empLevel;
		this.activeFlag = activeFlag;
		this.createBy = createBy;
		this.createDate = createDate;
		this.updateBy = updateBy;
		this.updateDate = updateDate;
	}

	public Employee(Long empDepId, Long empId, String empPassword, String empName, Date empJoinTime, int empLevel,
			int activeFlag, String createBy, Date createDate, String updateBy, Date updateDate) {
		super();
		this.empDepId = empDepId;
		this.empId = empId;
		this.empPassword = empPassword;
		this.empName = empName;
		this.empJoinTime = empJoinTime;
		this.empLevel = empLevel;
		this.activeFlag = activeFlag;
		this.createBy = createBy;
		this.createDate = createDate;
		this.updateBy = updateBy;
		this.updateDate = updateDate;
	}

	public Employee() {
		super();
	}


	@Override
	public String toString() {
		return "Employee [rowId=" + rowId + ", empDepId=" + empDepId + ", empId=" + empId + ", empPassword="
				+ empPassword + ", empName=" + empName + ", empJoinTime=" + empJoinTime + ", empLevel=" + empLevel
				+ ", activeFlag=" + activeFlag + ", createBy=" + createBy + ", createDate=" + createDate + ", updateBy="
				+ updateBy + ", updateDate=" + updateDate + ", empDepName=" + empDepName + "]";
	}

	public Employee(Long empDepId, Long empId, String empPassword, String empName, Date empJoinTime, int empLevel,
			String updateBy, Date updateDate) {
		super();
		this.empDepId = empDepId;
		this.empId = empId;
		this.empPassword = empPassword;
		this.empName = empName;
		this.empJoinTime = empJoinTime;
		this.empLevel = empLevel;
		this.updateBy = updateBy;
		this.updateDate = updateDate;
	}

	public Employee(Long rowId, Long empDepId, Long empId, String empPassword, String empName, Date empJoinTime,
			int empLevel, String updateBy, Date updateDate) {
		super();
		this.rowId = rowId;
		this.empDepId = empDepId;
		this.empId = empId;
		this.empPassword = empPassword;
		this.empName = empName;
		this.empJoinTime = empJoinTime;
		this.empLevel = empLevel;
		this.updateBy = updateBy;
		this.updateDate = updateDate;
	}
	

}
