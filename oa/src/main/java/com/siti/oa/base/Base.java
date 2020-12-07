package com.siti.oa.base;

import java.io.Serializable;
import java.util.Date;

public class Base implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer activeFlag;
	private String createBy;
	private Date createDate;
	private String updateBy;
	private Date updateDate;

	public Integer getActiveFlag() {
		return activeFlag;
	}

	public void setActiveFlag(Integer activeFlag) {
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

	public Base(Integer activeFlag, String createBy, Date createDate, String updateBy, Date updateDate) {
		super();
		this.activeFlag = activeFlag;
		this.createBy = createBy;
		this.createDate = createDate;
		this.updateBy = updateBy;
		this.updateDate = updateDate;
	}

	public Base() {
		super();
	}

	@Override
	public String toString() {
		return "Base [activeFlag=" + activeFlag + ", createBy=" + createBy + ", createDate=" + createDate
				+ ", updateBy=" + updateBy + ", updateDate=" + updateDate + "]";
	}

	public Base(String updateBy, Date updateDate) {
		super();
		this.updateBy = updateBy;
		this.updateDate = updateDate;
	}

	public Base(Integer activeFlag, String createBy, Date createDate) {
		this.activeFlag = activeFlag;
		this.createBy = createBy;
		this.createDate = createDate;
	}
	
}
