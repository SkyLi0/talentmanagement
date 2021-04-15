package com.a01.talent.vo.manage;
//出勤率
public class Attendance {
    //记录id
    private long record_id;
    //员工工号
    private long employee_id;
    //公司编号
    private long company_id;
    //公司名称
    private String company_name;
    //出勤率
    private float attend_percent;

    @Override
    public String toString() {
        return "Attendance{" +
                "record_id=" + record_id +
                ", employee_id=" + employee_id +
                ", company_id=" + company_id +
                ", company_name='" + company_name + '\'' +
                ", attend_percent=" + attend_percent +
                '}';
    }

    public long getRecord_id() {
        return record_id;
    }

    public void setRecord_id(long record_id) {
        this.record_id = record_id;
    }

    public long getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(long employee_id) {
        this.employee_id = employee_id;
    }

    public long getCompany_id() {
        return company_id;
    }

    public void setCompany_id(long company_id) {
        this.company_id = company_id;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public float getAttend_percent() {
        return attend_percent;
    }

    public void setAttend_percent(float attend_percent) {
        this.attend_percent = attend_percent;
    }
}
