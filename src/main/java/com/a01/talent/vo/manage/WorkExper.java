package com.a01.talent.vo.manage;

import java.util.Date;

//工作经历
public class WorkExper {
    //工作经历id号
    private Integer work_id;
    //公司id
    private long company_id;
    //档案编号
    private  Integer archive_id;
    //职位
    private  String person_position;
    //入职时间
    private Date entry_time;
    //离职时间
    private Date out_time;
    //离职原因
    private String reason;

    @Override
    public String toString() {
        return "WorkExper{" +
                "work_id=" + work_id +
                ", company_id=" + company_id +
                ", archive_id=" + archive_id +
                ", person_position='" + person_position + '\'' +
                ", entry_time='" + entry_time + '\'' +
                ", out_time='" + out_time + '\'' +
                ", reason='" + reason + '\'' +
                '}';
    }

    public long getCompany_id() {
        return company_id;
    }

    public void setCompany_id(long company_id) {
        this.company_id = company_id;
    }

    public Integer getWork_id() {
        return work_id;
    }

    public void setWork_id(Integer work_id) {
        this.work_id = work_id;
    }


    public Integer getArchive_id() {
        return archive_id;
    }

    public void setArchive_id(Integer archive_id) {
        this.archive_id = archive_id;
    }

    public String getPerson_position() {
        return person_position;
    }

    public void setPerson_position(String person_position) {
        this.person_position = person_position;
    }

    public Date getEntry_time() {
        return entry_time;
    }

    public void setEntry_time(Date entry_time) {
        this.entry_time = entry_time;
    }

    public Date getOut_time() {
        return out_time;
    }

    public void setOut_time(Date out_time) {
        this.out_time = out_time;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
