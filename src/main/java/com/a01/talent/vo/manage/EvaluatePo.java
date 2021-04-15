package com.a01.talent.vo.manage;

import java.util.Date;
//评价表
public class EvaluatePo {
    private long eva_id;        //评价id
    private long com_id;        //公司id
    private Integer archive_id;    //人才档案id
    private long employee_id;   //公司内部员工工号id
    private String company_name; //公司名称
    private String employee;    //员工姓名
    private long leader_id;     //评价人的员工工号id
    private String leader;      //评价人姓名
    private String evaluate;    //评价内容
    private Date eva_date;    //评价日期

    @Override
    public String toString() {
        return "EvaluatePo{" +
                "eva_id=" + eva_id +
                ", com_id=" + com_id +
                ", archive_id=" + archive_id +
                ", employee_id=" + employee_id +
                ", company_name='" + company_name + '\'' +
                ", employee='" + employee + '\'' +
                ", leader_id=" + leader_id +
                ", leader='" + leader + '\'' +
                ", evaluate='" + evaluate + '\'' +
                ", eva_date=" + eva_date +
                '}';
    }

    public long getEva_id() {
        return eva_id;
    }

    public void setEva_id(long eva_id) {
        this.eva_id = eva_id;
    }

    public long getCom_id() {
        return com_id;
    }

    public void setCom_id(long com_id) {
        this.com_id = com_id;
    }

    public Integer getArchive_id() {
        return archive_id;
    }

    public void setArchive_id(Integer archive_id) {
        this.archive_id = archive_id;
    }

    public long getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(long employee_id) {
        this.employee_id = employee_id;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public long getLeader_id() {
        return leader_id;
    }

    public void setLeader_id(long leader_id) {
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
