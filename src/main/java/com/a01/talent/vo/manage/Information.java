package com.a01.talent.vo.manage;
//个人信息
public class Information {
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
    private long phone;
    //公司编号
    private long com_id;
    //邮箱
    private String email;

    @Override
    public String toString() {
        return "Information{" +
                "archive_id=" + archive_id +
                ", personname='" + personname + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday='" + birthday + '\'' +
                ", age=" + age +
                ", identity_id='" + identity_id + '\'' +
                ", education='" + education + '\'' +
                ", address='" + address + '\'' +
                ", phone=" + phone +
                ", com_id=" + com_id +
                ", email='" + email + '\'' +
                '}';
    }

    public Integer getArchive_id() {
        return archive_id;
    }

    public void setArchive_id(Integer archive_id) {
        this.archive_id = archive_id;
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

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public long getCom_id() {
        return com_id;
    }

    public void setCom_id(long com_id) {
        this.com_id = com_id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
