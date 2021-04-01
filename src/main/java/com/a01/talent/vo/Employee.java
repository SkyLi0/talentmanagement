package com.a01.talent.vo;

public class Employee {
    private Long emp_id;        //员工工号id
    private String emp_name;    //员工姓名
    private Long com_id;        //公司id
    private Long achive_id;     //档案id
    private Long dnumber;       //部门id

    public Long getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(Long emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public Long getCom_id() {
        return com_id;
    }

    public void setCom_id(Long com_id) {
        this.com_id = com_id;
    }

    public Long getAchive_id() {
        return achive_id;
    }

    public void setAchive_id(Long achive_id) {
        this.achive_id = achive_id;
    }

    public Long getDnumber() {
        return dnumber;
    }

    public void setDnumber(Long dnumber) {
        this.dnumber = dnumber;
    }
}
