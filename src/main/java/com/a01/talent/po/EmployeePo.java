package com.a01.talent.po;

import com.a01.talent.vo.Employee;

import java.util.List;

public class EmployeePo {
    private long dnumber;                   //部门编号
    private String dname;                   //部门名字
    private List<Employee> employees;       //部门下的员工集合

    public long getDnumber() {
        return dnumber;
    }

    public void setDnumber(long dnumber) {
        this.dnumber = dnumber;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
