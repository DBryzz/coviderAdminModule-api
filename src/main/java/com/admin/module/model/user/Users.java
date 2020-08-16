package com.admin.module.model.user;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.Set;

import javax.persistence.*;

import com.admin.module.model.Location;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Data
@Entity(name = "USER_tbl")
@Inheritance(strategy = InheritanceType.JOINED) // JOINED and comment next line
@DiscriminatorColumn(name = "USER_TYPE", discriminatorType = DiscriminatorType.STRING)
public class Users implements Serializable, UserDetails {

    // @Size(min = 5, max = 60, message = "Name must be between 5 to 60 characters")

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ID", columnDefinition = "bigint(10)", length = 8)
    private int userId;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "locationId", nullable = false)
    //@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Location userLocation;

    @Column(name = "USER_FULLNAME", unique = true, nullable = false, columnDefinition = "varchar(50) NOT NULL", length = 50)
    private String userFullName;

    @Column(name = "USER_NAME", nullable = false, columnDefinition = "varchar(10) NOT NULL", length = 10)
    private String userName;

    @Column(name = "PASSWORD", nullable = false, columnDefinition = "varchar(255)", length = 255)
    private String userPassword;


    @Column(name = "AUTHORITIES", nullable = false, columnDefinition = "varchar(255)", length = 255)
    private Set<? extends GrantedAuthority> grantedAuthorities;


    @Column(name = "ACCOUNT_EXPIRED", nullable = false, columnDefinition = "varchar(6)", length = 6)
    private boolean isAccountNonExpired;

    @Column(name = "ACCOUNT_LOCKED", nullable = false, columnDefinition = "varchar(6)", length = 6)
    private boolean isAccountNonLocked;

    @Column(name = "CREDENTIAL_EXPIRED", nullable = false, columnDefinition = "varchar(6)", length = 6)
    private boolean isCredentialsNonExpired;

    @Column(name = "ENABLED", nullable = false, columnDefinition = "varchar(6)", length = 6)
    private boolean isEnabled;

    @Column(name = "USER_EMAIL", nullable = false, columnDefinition = "varchar(50) default 'john.doe@email.com'", length = 50)
    private String userEmail;


    @Temporal(value = TemporalType.DATE)
    @Column(name = "USER_DOB", nullable = false, columnDefinition = "date")
    private Date userDOB;


    @Enumerated(value = EnumType.STRING)
    @Column(name = "USER_ROLE", nullable = false, columnDefinition = "varchar(8)", length = 8)
    private UserRole userRole;


    @Transient
    private transient String userDateOfBirthString;


    public Users() {

    }

    public Users(int userId, Location userLocation,
                 String userFullName, String userName,
                 String userPassword, Set<? extends GrantedAuthority> grantedAuthorities,
                 boolean isAccountNonExpired, boolean isAccountNonLocked,
                 boolean isCredentialsNonExpired, boolean isEnabled,
                 String userEmail, Date userDOB, UserRole userRole,
                 String userDateOfBirthString) {
        this.userId = userId;
        this.userLocation = userLocation;
        this.userFullName = userFullName;
        this.userName = userName;
        this.userPassword = userPassword;
        this.grantedAuthorities = grantedAuthorities;
        this.isAccountNonExpired = isAccountNonExpired;
        this.isAccountNonLocked = isAccountNonLocked;
        this.isCredentialsNonExpired = isCredentialsNonExpired;
        this.isEnabled = isEnabled;
        this.userEmail = userEmail;
        this.userDOB = userDOB;
        this.userRole = userRole;
        this.userDateOfBirthString = userDateOfBirthString;
    }


    @Override
    public String toString() {
        return "Users [userId=" + userId + ", userFullName=" + userFullName + ", userName=" + userName + ", userEmail="
                + userEmail + ", userDOB=" + userDOB + ", userPassword=" + userPassword + ", userType=" + userRole
                + "]";
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }

    // to display on view
    public String getUserDateOfBirthString() {
        return userDOB.toString();
    }

    public void setUserDateOfBirthString(String userDateOfBirthString) {
        this.userDateOfBirthString = userDateOfBirthString;
    }


    @JsonIgnore
    public int getLocationId() {
        return userLocation.getLocationId();
    }

    @JsonIgnore
    public String getLocationRegion() {
        return userLocation.getRegion();
    }

    @JsonIgnore
    public String getLocationDivision() {
        return userLocation.getDivision();
    }

    @JsonIgnore
    public String getLocationTown() {
        return userLocation.getTown();
    }


    public Location getUserLocation() {
        return userLocation;
    }

    public Location getUserLocation_1() {
        return new Location(getLocationId(), getLocationRegion(), getLocationDivision(), getLocationTown());
    }

    @JsonIgnore
    public void setUserLocation() {
        this.userLocation = new Location(getLocationId(), getLocationRegion(), getLocationDivision(), getLocationTown());
    }

    @JsonIgnore
    public void putUserLocation(Location location) {
        this.userLocation = location;
    }

    public Set<? extends GrantedAuthority> getGrantedAuthorities() {
        return grantedAuthorities;
    }

    public void setAccountNonExpired(boolean accountNonExpired) {
        isAccountNonExpired = accountNonExpired;
    }

    public void setAccountNonLocked(boolean accountNonLocked) {
        isAccountNonLocked = accountNonLocked;
    }

    public void setCredentialsNonExpired(boolean credentialsNonExpired) {
        isCredentialsNonExpired = credentialsNonExpired;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return grantedAuthorities;
    }

    @Override
    public String getPassword() {
        return userPassword;
    }

    @Override
    public String getUsername() {
        return userName;
    }

    @Override
    public boolean isAccountNonExpired() {
        return isAccountNonExpired;
    }

    @Override
    public boolean isAccountNonLocked() {
        return isAccountNonLocked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return isCredentialsNonExpired;
    }

    @Override
    public boolean isEnabled() {
        return isEnabled;
    }
}
