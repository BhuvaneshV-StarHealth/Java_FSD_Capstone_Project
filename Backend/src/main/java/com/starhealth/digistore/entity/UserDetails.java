package com.starhealth.digistore.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Users")
public class UserDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userID;
	private String userName;
	private String userPassword;
	private String useremail;
	private String userAddress;
	private long userMobileNo;
	private String userRole;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUseremail() {
		return useremail;
	}
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public long getUserMobileNo() {
		return userMobileNo;
	}
	public void setUserMobileNo(long userMobileNo) {
		this.userMobileNo = userMobileNo;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	public UserDetails(String userName, String userPassword, String useremail, String userAddress, long userMobileNo,
			String userRole) {
		super();
		this.userName = userName;
		this.userPassword = userPassword;
		this.useremail = useremail;
		this.userAddress = userAddress;
		this.userMobileNo = userMobileNo;
		this.userRole = userRole;
	}
	public UserDetails() {
		super();
	}
}
