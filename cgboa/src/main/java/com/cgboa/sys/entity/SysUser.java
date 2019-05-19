package com.cgboa.sys.entity;

import java.io.Serializable;
import java.util.Date;

public class SysUser implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2202280273310222350L;

	private Long userId;		//用户id
	
	private String userName;	//登录用户名
	
	private String userTel;		//用户电话
	
	private String realName;    //真实姓名
	
	private String pinyin;
	
	private String eamil;		//邮件
	
	private String address;		//地址
	
	private String userEdu;		//用户学历
	
	private Boolean superman = false;

	private String school;		//学校
	
	private String idCard;		//用户身份证
	
	private String bank;		//银行
	
	private String sex;			//性别
	
	private String themeSkin;	//主题皮肤
	
	private Date birth;			//生日
	
	private String userSign;	//用户签名
	
	private String password;	//用户密码
	
	private String salary;		//用户薪水
	
	private String imgPath;		//用户头像路径
	
	private Date hireTime;		//入职时间
	
	private Integer isLock=0;		//该用户是否被禁用

	private String lastLoginIp;	//用户最后登录ip；

	private Date lastLoginTime;	//最后登录时间
	
	private Date modifyTime;		//最后修改时间

	private Long modifyUserId;	//最后修改此用户的用户id

	private Long fatherId;		//上司id
	
	private Integer holiday;   //请假天数

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserTel() {
		return userTel;
	}

	public void setUserTel(String userTel) {
		this.userTel = userTel;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getPinyin() {
		return pinyin;
	}

	public void setPinyin(String pinyin) {
		this.pinyin = pinyin;
	}

	public String getEamil() {
		return eamil;
	}

	public void setEamil(String eamil) {
		this.eamil = eamil;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getUserEdu() {
		return userEdu;
	}

	public void setUserEdu(String userEdu) {
		this.userEdu = userEdu;
	}

	public Boolean getSuperman() {
		return superman;
	}

	public void setSuperman(Boolean superman) {
		this.superman = superman;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getThemeSkin() {
		return themeSkin;
	}

	public void setThemeSkin(String themeSkin) {
		this.themeSkin = themeSkin;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public String getUserSign() {
		return userSign;
	}

	public void setUserSign(String userSign) {
		this.userSign = userSign;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getImgPath() {
		return imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	public Date getHireTime() {
		return hireTime;
	}

	public void setHireTime(Date hireTime) {
		this.hireTime = hireTime;
	}

	public Integer getIsLock() {
		return isLock;
	}

	public void setIsLock(Integer isLock) {
		this.isLock = isLock;
	}

	public String getLastLoginIp() {
		return lastLoginIp;
	}

	public void setLastLoginIp(String lastLoginIp) {
		this.lastLoginIp = lastLoginIp;
	}

	public Date getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public Long getModifyUserId() {
		return modifyUserId;
	}

	public void setModifyUserId(Long modifyUserId) {
		this.modifyUserId = modifyUserId;
	}

	public Long getFatherId() {
		return fatherId;
	}

	public void setFatherId(Long fatherId) {
		this.fatherId = fatherId;
	}

	public Integer getHoliday() {
		return holiday;
	}

	public void setHoliday(Integer holiday) {
		this.holiday = holiday;
	}

	
}
