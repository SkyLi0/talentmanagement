package com.a01.talent.po;
//个人详细信息实体类

import com.a01.talent.vo.manage.*;

import java.util.List;

public class PersonManage {
//    基本信息
//档案编号
    private Integer archive_id;
    //姓名
    private String personname;
    //性别
    private String sex;
    //出生日期
    private String birthday;
    //年龄
    private Integer age;
    //身份证号
    private String identity_id;
    //学历
    private String education;
    //家庭地址
    private String address;
    //电话号码
    private String phone;
    //公司编号
    private long com_id;
    //邮箱
    private String email;
    //状态
    private boolean per_state;
    //    工作经历
    private List<WorkExper> workExpers;
//    重大事件记录：优秀事件
    private List<ImportantPo> goodevents;
    //违纪事件
    private List<ImportantPo> weijievents;
//    评价记录
    private  List<EvaluatePo> evaluations;
//    出勤率
    private  List<Attendance> attendances;
//    绩效完成率
    private  List<Achievements> achievements;

    public Integer getArchive_id() {
        return archive_id;
    }

    public void setArchive_id(Integer archive_id) {
        this.archive_id = archive_id;
    }

    public boolean isPer_state() {
        return per_state;
    }

    public void setPer_state(boolean per_state) {
        this.per_state = per_state;
    }

    public String getPersonname() {
        return personname;
    }

    public void setPersonname(String personname) {
        this.personname = personname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getIdentity_id() {
        return identity_id;
    }

    public void setIdentity_id(String identity_id) {
        this.identity_id = identity_id;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public long getCom_id() {
        return com_id;
    }

    public void setCom_id(Integer com_id) {
        this.com_id = com_id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<WorkExper> getWorkExpers() {
        return workExpers;
    }

    public void setWorkExpers(List<WorkExper> workExpers) {
        this.workExpers = workExpers;
    }

    public List<ImportantPo> getGoodevents() {
        return goodevents;
    }

    public void setGoodevents(List<ImportantPo> goodevents) {
        this.goodevents = goodevents;
    }

    public List<ImportantPo> getWeijievents() {
        return weijievents;
    }

    public void setWeijievents(List<ImportantPo> weijievents) {
        this.weijievents = weijievents;
    }

    public List<EvaluatePo> getEvaluations() {
        return evaluations;
    }

    public void setEvaluations(List<EvaluatePo> evaluations) {
        this.evaluations = evaluations;
    }

    public List<Attendance> getAttendances() {
        return attendances;
    }

    public void setAttendances(List<Attendance> attendances) {
        this.attendances = attendances;
    }

    public List<Achievements> getAchievements() {
        return achievements;
    }

    public void setAchievements(List<Achievements> achievements) {
        this.achievements = achievements;
    }

    public void setCom_id(long com_id) {
        this.com_id = com_id;
    }

    public boolean getState() {
        return per_state;
    }

    public void setState(boolean per_state) {
        this.per_state = per_state;
    }

    @Override
    public String toString() {
        return "PersonManage{" +
                "archive_id=" + archive_id +
                ", personname='" + personname + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday='" + birthday + '\'' +
                ", age=" + age +
                ", identity_id='" + identity_id + '\'' +
                ", education='" + education + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", com_id=" + com_id +
                ", email='" + email + '\'' +
                ", per_state=" + per_state +
                ", workExpers=" + workExpers +
                ", goodevents=" + goodevents +
                ", weijievents=" + weijievents +
                ", evaluations=" + evaluations +
                ", attendances=" + attendances +
                ", achievements=" + achievements +
                '}';
    }
}
