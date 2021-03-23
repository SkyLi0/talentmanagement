package com.a01.talent.vo;

import org.springframework.web.multipart.MultipartFile;

//注册信息类
public class RegisterVo {
    Integer id;             //公司id
    String username;        //账号
    String password;        //密码
    String company_name;    //公司名字
    String com_phone;       //公司电话
    String com_email;       //公司邮件
    String com_addr;        //公司地址
    String com_intro;       //公司介绍
    MultipartFile file;     //公司凭证
    String com_identity_path; //公司凭证保存路径

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getCom_phone() {
        return com_phone;
    }

    public void setCom_phone(String com_phone) {
        this.com_phone = com_phone;
    }

    public String getCom_email() {
        return com_email;
    }

    public void setCom_email(String com_email) {
        this.com_email = com_email;
    }

    public String getCom_addr() {
        return com_addr;
    }

    public void setCom_addr(String com_addr) {
        this.com_addr = com_addr;
    }

    public String getCom_intro() {
        return com_intro;
    }

    public void setCom_intro(String com_intro) {
        this.com_intro = com_intro;
    }

    public String getCom_identity_path() {
        return com_identity_path;
    }

    public void setCom_identity_path(String com_identity_path) {
        this.com_identity_path = com_identity_path;
    }

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }
}
