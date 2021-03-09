package com.a01.talent.dao;

import com.a01.talent.po.Menus;

import java.util.List;

public interface MenusDao {
    public List<Menus> getMenus(Integer roleId);
}
