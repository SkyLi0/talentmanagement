package com.a01.talent.po;

public class Department {
    private long company_id;
    private long dnumber;
    private String dname;
    private long manager_id;
    private String daddress;

    @Override
    public String toString() {
        return "Department{" +
                "company_id=" + company_id +
                ", dnumber=" + dnumber +
                ", dname='" + dname + '\'' +
                ", manager_id=" + manager_id +
                ", daddress='" + daddress + '\'' +
                '}';
    }

    public long getCompany_id() {
        return company_id;
    }

    public void setCompany_id(long company_id) {
        this.company_id = company_id;
    }

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

    public long getManager_id() {
        return manager_id;
    }

    public void setManager_id(long manager_id) {
        this.manager_id = manager_id;
    }

    public String getDaddress() {
        return daddress;
    }

    public void setDaddress(String daddress) {
        this.daddress = daddress;
    }
}
