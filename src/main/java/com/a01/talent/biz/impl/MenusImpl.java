package com.a01.talent.biz.impl;

import com.a01.talent.biz.MenusBiz;
import com.a01.talent.dao.MenusDao;
import com.a01.talent.po.Menus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MenusImpl implements MenusBiz {
    @Autowired
    private MenusDao menusDao;
    @Override
    public List<Menus> getMenus(Integer roleId) {
        try{
            return menusDao.getMenus(roleId);
        }catch (Exception e){
            return null;
        }

    }
}
