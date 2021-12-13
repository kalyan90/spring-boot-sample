package com.sandbox.userservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userid;
    private String firstname;
    private String lastname;
    private String email;
    private long departmentid;

    /**
     * @return Long return the userid
     */
    public Long getUserid() {
        return userid;
    }

    /**
     * @param userid the userid to set
     */
    public void setUserid(Long userid) {
        this.userid = userid;
    }

    /**
     * @return String return the firstname
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * @param firstname the firstname to set
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * @return String return the lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * @param lastname the lastname to set
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * @return String return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return long return the departmentid
     */
    public long getDepartmentid() {
        return departmentid;
    }

    /**
     * @param departmentid the departmentid to set
     */
    public void setDepartmentid(long departmentid) {
        this.departmentid = departmentid;
    }

}
