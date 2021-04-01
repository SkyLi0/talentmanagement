package com.a01.talent.po;

import java.util.Date;

public class ImportantPo {
    private Long com_id;
    private Long archive_id;
    private Long employee_id;
    private String employee_name;
    private Integer state;
    private String excellent_thing;
    private String violation_thing;
    private Date record_time;

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

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
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
