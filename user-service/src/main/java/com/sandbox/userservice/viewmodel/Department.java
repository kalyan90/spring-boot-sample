package com.sandbox.userservice.viewmodel;

public class Department {
    private Long departmentid;
    private String departmentname;
    private String departmentaddress;
    private String departmentcode;

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

    /**
     * @return String return the departmentname
     */
    public String getDepartmentname() {
        return departmentname;
    }

    /**
     * @param departmentname the departmentname to set
     */
    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname;
    }

    /**
     * @return String return the departmentaddress
     */
    public String getDepartmentaddress() {
        return departmentaddress;
    }

    /**
     * @param departmentaddress the departmentaddress to set
     */
    public void setDepartmentaddress(String departmentaddress) {
        this.departmentaddress = departmentaddress;
    }

    /**
     * @return String return the departmentcode
     */
    public String getDepartmentcode() {
        return departmentcode;
    }

    /**
     * @param departmentcode the departmentcode to set
     */
    public void setDepartmentcode(String departmentcode) {
        this.departmentcode = departmentcode;
    }

}
