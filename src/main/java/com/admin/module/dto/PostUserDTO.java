package com.admin.module.dto;

import java.util.Date;

import com.admin.module.model.Location;

//import com.admin.module.model.user.UserType;

import lombok.Data;

@Data
public class PostUserDTO {

    private String userFullName;
    private String userName;
    private String userEmail;
    private Date userDOB;
    private String userPassword;
    private String userRole;
    private Location userLocation;

    //private transient String userDateOfBirthString;

    public PostUserDTO() {

    }

    public PostUserDTO(String userFullName, String userName, String userEmail, Date userDOB,
                        String userPassword, String userRole, Location userLocation
                       //String userDateOfBirthString
                       ) {

        super();
        this.userFullName = userFullName;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userDOB = userDOB;
        this.userPassword = userPassword;
        this.userRole = userRole;
        this.userLocation = userLocation;

        //this.userDateOfBirthString = userDateOfBirthString;
    }

    @Override
    public String toString() {
        return "UserDTO [userFullName=" + userFullName + ", userName=" + userName
                + ", userEmail=" + userEmail + ", userDOB=" + userDOB + ", userPassword=" + userPassword + ", userRole="
                + userRole + "]";
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

    public Date getUserDOB() {
        return userDOB;
    }

    public void setUserDOB(Date userDOB) {
        this.userDOB = userDOB;
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

   /*
    public String getUserDateOfBirthString() {
        return userDOB.toString();
    }

    public void setUserDateOfBirthString(String userDateOfBirthString) {
        this.userDateOfBirthString = userDateOfBirthString;
    }
*/




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