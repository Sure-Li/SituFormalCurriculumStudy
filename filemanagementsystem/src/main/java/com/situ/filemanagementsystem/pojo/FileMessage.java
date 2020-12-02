package com.situ.filemanagementsystem.pojo;

import java.io.Serializable;
import java.util.Date;

public class FileMessage implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long rowId;
	private String fileName;
	private String fileType;
	private double fileSize;
	private String filePath;
	private Date fileLastModefy;
	private int activeFlag;
	private String createBy;
	private Date createDate;
	private String updateBy;
	private Date updateDate;

	public long getRowId() {
		return rowId;
	}

	public void setRowId(long rowId) {
		this.rowId = rowId;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public double getFileSize() {
		return fileSize;
	}

	public void setFileSize(double fileSize) {
		this.fileSize = fileSize;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public Date getFileLastModefy() {
		return fileLastModefy;
	}

	public void setFileLastModefy(Date fileLastModefy) {
		this.fileLastModefy = fileLastModefy;
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

	public FileMessage(long rowId, String fileName, String fileType, double fileSize, String filePath,
			Date fileLastModefy, int activeFlag, String createBy, Date createDate, String updateBy, Date updateDate) {
		super();
		this.rowId = rowId;
		this.fileName = fileName;
		this.fileType = fileType;
		this.fileSize = fileSize;
		this.filePath = filePath;
		this.fileLastModefy = fileLastModefy;
		this.activeFlag = activeFlag;
		this.createBy = createBy;
		this.createDate = createDate;
		this.updateBy = updateBy;
		this.updateDate = updateDate;
	}

	public FileMessage() {
		super();
	}

	@Override
	public String toString() {
		return "FileMessage [rowId=" + rowId + ", fileName=" + fileName + ", fileType=" + fileType + ", fileSize="
				+ fileSize + ", filePath=" + filePath + ", fileLastModefy=" + fileLastModefy + ", activeFlag="
				+ activeFlag + ", createBy=" + createBy + ", createDate=" + createDate + ", updateBy=" + updateBy
				+ ", updateDate=" + updateDate + "]";
	}

	public FileMessage(String fileName, String fileType, double fileSize, String filePath, Date fileLastModefy,
			int activeFlag, String createBy, Date createDate, String updateBy, Date updateDate) {
		super();
		this.fileName = fileName;
		this.fileType = fileType;
		this.fileSize = fileSize;
		this.filePath = filePath;
		this.fileLastModefy = fileLastModefy;
		this.activeFlag = activeFlag;
		this.createBy = createBy;
		this.createDate = createDate;
		this.updateBy = updateBy;
		this.updateDate = updateDate;
	}
	

}
