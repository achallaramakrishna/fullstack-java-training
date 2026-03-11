package com.training.model;

public class BRUser {
	
	private int userId;
	
	private String firstName;
	
	private String lastName;
	
	private String userName;
	
	private String userPwd;
	
	private String mobile;
	
	private String email;
	
	private int profileId;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFistName() {
		return firstName;
	}

	public void setFistName(String fistName) {
		this.firstName = fistName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getProfileId() {
		return profileId;
	}

	public void setProfileId(int profileId) {
		this.profileId = profileId;
	}

	@Override
	public String toString() {
		return "BRUser [userId=" + userId + ", fistName=" + firstName + ", lastName=" + lastName + ", userName="
				+ userName + ", userPwd=" + userPwd + ", mobile=" + mobile + ", email=" + email + ", profileId="
				+ profileId + "]";
	}
	
	
	
	
	
	

}
