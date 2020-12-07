package com.siti.oa.user.pojo;

import java.util.Date;

import com.siti.oa.base.Base;

public class User extends Base {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long rowId;
	private String userName;
	private Long userId;
	private String userPassword;
	private String userPhoto;
	private Integer userLoginCount;
	private Date userLastLoginTime;
	private String userLastLoginIp;
	private Integer userLock;

	public Long getRowId() {
		return rowId;
	}

	public void setRowId(Long rowId) {
		this.rowId = rowId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserPhoto() {
		return userPhoto;
	}

	public void setUserPhoto(String userPhoto) {
		this.userPhoto = userPhoto;
	}

	public Integer getUserLoginCount() {
		return userLoginCount;
	}

	public void setUserLoginCount(Integer userLoginCount) {
		this.userLoginCount = userLoginCount;
	}

	public Date getUserLastLoginTime() {
		return userLastLoginTime;
	}

	public void setUserLastLoginTime(Date userLastLoginTime) {
		this.userLastLoginTime = userLastLoginTime;
	}

	public String getUserLastLoginIp() {
		return userLastLoginIp;
	}

	public void setUserLastLoginIp(String userLastLoginIp) {
		this.userLastLoginIp = userLastLoginIp;
	}

	public Integer getUserLock() {
		return userLock;
	}

	public void setUserLock(Integer userLock) {
		this.userLock = userLock;
	}

	public User(Integer activeFlag, String createBy, Date createDate, String updateBy, Date updateDate, Long rowId,
			String userName, Long userId, String userPhoto, Integer userLoginCount, Date userLastLoginTime,
			String userLastLoginIp, Integer userLock) {
		super(activeFlag, createBy, createDate, updateBy, updateDate);
		this.rowId = rowId;
		this.userName = userName;
		this.userId = userId;
		this.userPhoto = userPhoto;
		this.userLoginCount = userLoginCount;
		this.userLastLoginTime = userLastLoginTime;
		this.userLastLoginIp = userLastLoginIp;
		this.userLock = userLock;
	}

	public User(Integer activeFlag, String createBy, Date createDate, String updateBy, Date updateDate, String userName,
			Long userId, String userPhoto, Integer userLoginCount, Date userLastLoginTime, String userLastLoginIp,
			Integer userLock) {
		super(activeFlag, createBy, createDate, updateBy, updateDate);
		this.userName = userName;
		this.userId = userId;
		this.userPhoto = userPhoto;
		this.userLoginCount = userLoginCount;
		this.userLastLoginTime = userLastLoginTime;
		this.userLastLoginIp = userLastLoginIp;
		this.userLock = userLock;
	}

	public User() {
		super();
	}

	public User(Integer activeFlag, String createBy, Date createDate, String updateBy, Date updateDate) {
		super(activeFlag, createBy, createDate, updateBy, updateDate);
	}

	@Override
	public String toString() {
		return "User [rowId=" + rowId + ", userName=" + userName + ", userId=" + userId + ", userPhoto=" + userPhoto
				+ ", userLoginCount=" + userLoginCount + ", userLastLoginTime=" + userLastLoginTime
				+ ", userLastLoginIp=" + userLastLoginIp + ", userLock=" + userLock + ", activeFlag="
				+ super.getActiveFlag() + ", createBy=" + super.getCreateBy() + ", createDate=" + super.getCreateDate()
				+ ", updateBy=" + super.getUpdateBy() + ", updateDate=" + super.getUpdateDate() + "]";
	}

	public User(Integer activeFlag, String createBy, Date createDate, String userName,
			Long userId, String userPhoto, Integer userLoginCount, Date userLastLoginTime, String userLastLoginIp,
			Integer userLock) {
		super(activeFlag, createBy, createDate);
		this.userName = userName;
		this.userId = userId;
		this.userPhoto = userPhoto;
		this.userLoginCount = userLoginCount;
		this.userLastLoginTime = userLastLoginTime;
		this.userLastLoginIp = userLastLoginIp;
		this.userLock = userLock;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public User(Integer activeFlag, String createBy, Date createDate, String updateBy, Date updateDate, Long rowId,
			String userName, Long userId, String userPassword, String userPhoto, Integer userLoginCount,
			Date userLastLoginTime, String userLastLoginIp, Integer userLock) {
		super(activeFlag, createBy, createDate, updateBy, updateDate);
		this.rowId = rowId;
		this.userName = userName;
		this.userId = userId;
		this.userPassword = userPassword;
		this.userPhoto = userPhoto;
		this.userLoginCount = userLoginCount;
		this.userLastLoginTime = userLastLoginTime;
		this.userLastLoginIp = userLastLoginIp;
		this.userLock = userLock;
	}
	
	


}
