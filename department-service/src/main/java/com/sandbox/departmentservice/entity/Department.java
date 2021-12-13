package com.sandbox.departmentservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Department {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departmentid;
    private String departmentname;
    private String departmentaddress;
    private String departmentcode;
    public String getDepartmentname() {
        return departmentname;
    }
    public String getDepartmentcode() {
        return departmentcode;
    }
    public void setDepartmentcode(String departmentcode) {
        this.departmentcode = departmentcode;
    }
    public String getDepartmentaddress() {
        return departmentaddress;
    }
    public void setDepartmentaddress(String departmentaddress) {
        this.departmentaddress = departmentaddress;
    }
    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname;
    }

    /**
     * @return Long return the departmentid
     */
    public Long getDepartmentid() {
        return departmentid;
    }

    /**
     * @param departmentid the departmentid to set
     */
    public void setDepartmentid(Long departmentid) {
        this.departmentid = departmentid;
    }

}
