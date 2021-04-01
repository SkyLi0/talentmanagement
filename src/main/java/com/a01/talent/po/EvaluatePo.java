package com.a01.talent.po;

import java.util.Date;

public class EvaluatePo {
    private Long eva_id;        //评价id
    private Long com_id;        //公司id
    private Long archive_id;    //人才档案id
    private Long employee_id;   //公司内部员工工号id
    private String employee;    //员工姓名
    private Long leader_id;     //评价人的员工工号id
    private String leader;      //评价人姓名
    private String evaluate;    //评价内容
    private Date eva_date;    //评价日期

    public Long getEva_id() {
        return eva_id;
    }

    public void setEva_id(Long eva_id) {
        this.eva_id = eva_id;
    }

    public Long getCom_id() {
        return com_id;
    }

    public void setCom_id(Long com_id) {
        this.com_id = com_id;
    }

    public Long getArchive_id() {
        return archive_id;
    }

    public void setArchive_id(Long archive_id) {
        this.archive_id = archive_id;
    }

    public Long getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(Long employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public Long getLeader_id() {
        return leader_id;
    }

    public void setLeader_id(Long leader_id) {
        this.leader_id = leader_id;
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    public String getEvaluate() {
        return evaluate;
    }

    public void setEvaluate(String evaluate) {
        this.evaluate = evaluate;
    }

    public Date getEva_date() {
        return eva_date;
    }

    public void setEva_date(Date eva_date) {
        this.eva_date = eva_date;
    }
}
