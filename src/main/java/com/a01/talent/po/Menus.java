package com.a01.talent.po;

import java.util.List;

public class Menus {
    private Integer id;
    private String menusName;
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

    @Override
    public String toString() {
        return "Menus{" +
                "id=" + id +
                ", menusName='" + menusName + '\'' +
                ", path='" + path + '\'' +
                ", order=" + order +
                ", children=" + children +
                '}';
    }

}
