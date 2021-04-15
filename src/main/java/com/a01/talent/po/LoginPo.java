package com.a01.talent.po;

public class LoginPo {
    String username;
    Integer role_id;
    Integer company_id;
    String token;

    public String getUser() {
        return username;
    }

    public void setUser(String username) {
        this.username = username;
    }


    public Integer getRole_id() {
        return role_id;
    }

    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }

    public Integer getCompany_id() {
        return company_id;
    }

    public void setCompany_id(Integer company_id) {
        this.company_id = company_id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
