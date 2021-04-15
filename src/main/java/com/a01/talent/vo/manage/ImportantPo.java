package com.a01.talent.vo.manage;

import java.util.Date;
//重大事件记录
public class ImportantPo {
    private long com_id;//公司id号
    private Integer archive_id;//档案编号
    private long employee_id;//员工号
    private String employee_name;//员工姓名
    private Integer states;//状态
    private String excellent_thing;//优秀事件
    private String violation_thing;//违纪事件
    private Date record_time;//创建时间

    @Override
    public String toString() {
        return "ImportantPo{" +
                "com_id=" + com_id +
                ", archive_id=" + archive_id +
                ", employee_id=" + employee_id +
                ", employee_name='" + employee_name + '\'' +
                ", states=" + states +
                ", excellent_thing='" + excellent_thing + '\'' +
                ", violation_thing='" + violation_thing + '\'' +
                ", record_time=" + record_time +
                '}';
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

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public Integer getStates() {
        return states;
    }

    public void setStates(Integer states) {
        this.states = states;
    }

    public String getExcellent_thing() {
        return excellent_thing;
    }

    public void setExcellent_thing(String excellent_thing) {
        this.excellent_thing = excellent_thing;
    }

    public String getViolation_thing() {
        return violation_thing;
    }

    public void setViolation_thing(String violation_thing) {
        this.violation_thing = violation_thing;
    }

    public Date getRecord_time() {
        return record_time;
    }

    public void setRecord_time(Date record_time) {
        this.record_time = record_time;
    }
}
