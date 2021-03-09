package com.a01.talent.po;

import java.util.List;

public class Menus {
    private Integer id;
    private String menusName;
    private Integer roleId;
    private String path;
    private Integer order;
    private List<Menus> children;

    public void setId(Integer id){
        this.id = id;
    }
    public Integer getId(){
        return id;
    }

    public String getMenusName() {
        return menusName;
    }

    public void setMenusName(String menusName) {
        this.menusName = menusName;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public List<Menus> getChildren() {
        return children;
    }

    public void setChildren(List<Menus> children) {
        this.children = children;
    }
}
