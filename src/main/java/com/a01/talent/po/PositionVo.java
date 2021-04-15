package com.a01.talent.po;

public class PositionVo {
   private long employee_id;
   private  long archive_id;
   private  long company_id;
   private String emp_position;

    @Override
    public String toString() {
        return "PositionVo{" +
                "employee_id=" + employee_id +
                ", archive_id=" + archive_id +
                ", company_id=" + company_id +
                ", emp_position='" + emp_position + '\'' +
                '}';
    }

    public long getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(long employee_id) {
        this.employee_id = employee_id;
    }

    public long getArchive_id() {
        return archive_id;
    }

    public void setArchive_id(long archive_id) {
        this.archive_id = archive_id;
    }

    public long getCompany_id() {
        return company_id;
    }

    public void setCompany_id(long company_id) {
        this.company_id = company_id;
    }

    public String getEmp_position() {
        return emp_position;
    }

    public void setEmp_position(String emp_position) {
        this.emp_position = emp_position;
    }
}
