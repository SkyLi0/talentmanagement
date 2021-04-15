package com.a01.talent.vo;

public class Employee {
    private long eid;//员工号
    private Integer aid;//档案号
    private long cid;//公司号
    private String name;//姓名
    private String sex;//性别
    private String birthday;//生日
    private long identify;//身份证
    private String emp_position;//职位
    private String dname;//部门名字
    private String lname;//领导名字
    private long phone;//电话号码
    private long lid;//领导号
    private long did;//部门号
    private String email;//邮箱
    private String address;//地址
    private String time;//创建时间

    public Employee(long eid, Integer aid, long cid, String name, String sex, String birthday, long identify, String emp_position, long phone, long lid, long did, String email, String address) {
        this.eid = eid;
        this.aid = aid;
        this.cid = cid;
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
        this.identify = identify;
        this.emp_position = emp_position;
        this.phone = phone;
        this.lid = lid;
        this.did = did;
        this.email = email;
        this.address = address;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", aid=" + aid +
                ", cid=" + cid +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday='" + birthday + '\'' +
                ", identify='" + identify + '\'' +
                ", emp_position='" + emp_position+ '\'' +
                ", dname='" + dname + '\'' +
                ", lname=" + lname +
                ", phone=" + phone +
                ", lid=" + lid +
                ", did=" + did +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", time='" + time + '\'' +
                '}';
    }

    public long getEid() {
        return eid;
    }

    public void setEid(long eid) {
        this.eid = eid;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public long getCid() {
        return cid;
    }

    public void setCid(long cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public long getIdentify() {
        return identify;
    }

    public void setIdentify(long identify) {
        this.identify = identify;
    }

    public String getEmp_position() {
        return emp_position;
    }

    public void setEmp_position(String emp_position) {
        this.emp_position = emp_position;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public long getLid() {
        return lid;
    }

    public void setLid(long lid) {
        this.lid = lid;
    }

    public long getDid() {
        return did;
    }

    public void setDid(long did) {
        this.did = did;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
