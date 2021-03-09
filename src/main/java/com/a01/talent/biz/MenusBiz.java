package com.a01.talent.biz;

import com.a01.talent.po.Menus;

import java.util.List;

public interface MenusBiz{
    public List<Menus> getMenus(Integer roleId);
}
