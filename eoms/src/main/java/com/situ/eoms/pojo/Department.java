package com.situ.eoms.pojo;

import java.io.Serializable;
import java.util.Date;

public class Department implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long rowId;
	private Long depId;
	private String depName;
	private int depEmpNumber;
	private String depInfo;
	private int ActiveFlag;
	private String createBy;
	private Date createDate;
	private String updateBy;
	private Date updateDate;
	public Long getRowId() {
		return rowId;
	}
	public void setRowId(Long rowId) {
		this.rowId = rowId;
	}
	public Long getDepId() {
		return depId;
	}
	public void setDepId(Long depId) {
		this.depId = depId;
	}
	public String getDepName() {
		return depName;
	}
	public void setDepName(String depName) {
		this.depName = depName;
	}
	public int getDepEmpNumber() {
		return depEmpNumber;
	}
	public void setDepEmpNumber(int depEmpNumber) {
		this.depEmpNumber = depEmpNumber;
	}
	public String getDepInfo() {
		return depInfo;
	}
	public void setDepInfo(String depInfo) {
		this.depInfo = depInfo;
	}
	public int getActiveFlag() {
		return ActiveFlag;
	}
	public void setActiveFlag(int activeFlag) {
		ActiveFlag = activeFlag;
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
	public Department(Long rowId, Long depId, String depName, int depEmpNumber, String depInfo, int activeFlag,
			String createBy, Date createDate, String updateBy, Date updateDate) {
		super();
		this.rowId = rowId;
		this.depId = depId;
		this.depName = depName;
		this.depEmpNumber = depEmpNumber;
		this.depInfo = depInfo;
		ActiveFlag = activeFlag;
		this.createBy = createBy;
		this.createDate = createDate;
		this.updateBy = updateBy;
		this.updateDate = updateDate;
	}
	public Department(Long depId, String depName, int depEmpNumber, String depInfo, int activeFlag, String createBy,
			Date createDate, String updateBy, Date updateDate) {
		super();
		this.depId = depId;
		this.depName = depName;
		this.depEmpNumber = depEmpNumber;
		this.depInfo = depInfo;
		ActiveFlag = activeFlag;
		this.createBy = createBy;
		this.createDate = createDate;
		this.updateBy = updateBy;
		this.updateDate = updateDate;
	}
	public Department(Long depId, String depName, int depEmpNumber, String depInfo, String updateBy, Date updateDate) {
		super();
		this.depId = depId;
		this.depName = depName;
		this.depEmpNumber = depEmpNumber;
		this.depInfo = depInfo;
		this.updateBy = updateBy;
		this.updateDate = updateDate;
	}
	@Override
	public String toString() {
		return "Department [rowId=" + rowId + ", depId=" + depId + ", depName=" + depName + ", depEmpNumber="
				+ depEmpNumber + ", depInfo=" + depInfo + ", ActiveFlag=" + ActiveFlag + ", createBy=" + createBy
				+ ", createDate=" + createDate + ", updateBy=" + updateBy + ", updateDate=" + updateDate + "]";
	}
	public Department(Long depId, String depName, String depInfo, String updateBy, Date updateDate) {
		super();
		this.depId = depId;
		this.depName = depName;
		this.depInfo = depInfo;
		this.updateBy = updateBy;
		this.updateDate = updateDate;
	}
	public Department(Long rowId, Long depId, String depName, String depInfo, String updateBy, Date updateDate) {
		super();
		this.rowId = rowId;
		this.depId = depId;
		this.depName = depName;
		this.depInfo = depInfo;
		this.updateBy = updateBy;
		this.updateDate = updateDate;
	}
	
	
	
}
