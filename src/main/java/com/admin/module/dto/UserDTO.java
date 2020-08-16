package com.admin.module.dto;

import java.util.Date;

import com.admin.module.model.Location;

//import com.admin.module.model.user.UserRole;

import lombok.Data;

@Data
public class UserDTO {

	private int userId;
	private String userFullName;
	private String userName;
	private String userEmail;
	private String userPassword;
	private String userRole;
	private Location userLocation;

	private transient String userDateOfBirthString;

	public UserDTO() {
		
	}

	public UserDTO(int userId, String userFullName, String userName, String userEmail, Date userDOB,
			String userPassword, String userRole, Location userLocation, String userDateOfBirthString) {

		super();
		this.userId = userId;
		this.userFullName = userFullName;
		this.userName = userName;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
		this.userRole = userRole;
		this.userLocation = userLocation;

		this.userDateOfBirthString = userDateOfBirthString;
	}

	@Override
	public String toString() {
		return "UserDTO [userId=" + userId + ", userFullName=" + userFullName + ", userName=" + userName
				+ ", userEmail=" + userEmail + ", userPassword=" + userPassword + ", userRole="
				+ userRole + "]";
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	
	
	public Location getUserLocation() {
		return userLocation;
	}

	public void setUserLocation(Location userLocation) {
			this.userLocation = userLocation;
	}



	public String getUserFullName() {
		return userFullName;
	}

	public void setUserFullName(String userFullName) {
		this.userFullName = userFullName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public String getUserDateOfBirthString() {
		return userDateOfBirthString;
	}

	public void setUserDateOfBirthString(String userDateOfBirthString) {
		this.userDateOfBirthString = userDateOfBirthString;
	}
	
	
	
	

/*
 * public class AllUserDTO extends UserDTO {
 * 
 * }
 * 
 * public class NMUserDTO extends UserDTO {
 * 
 * }
 * 
 * public class AgentUserDTO extends UserDTO {
 * 
 * }
 * 
 * public class AdminUserDTO extends UserDTO {
 * 
 * }
 */
}