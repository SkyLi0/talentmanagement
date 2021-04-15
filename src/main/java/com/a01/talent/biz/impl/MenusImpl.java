package com.a01.talent.biz.impl;

import com.a01.talent.biz.MenusBiz;
import com.a01.talent.dao.MenusDao;
import com.a01.talent.po.Department;
import com.a01.talent.po.Menus;
import com.a01.talent.po.PositionVo;
import com.a01.talent.vo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MenusImpl implements MenusBiz {
    @Autowired
    private MenusDao menusDao;
    @Override
    public List<Menus> getMenus() {
        try{
            return menusDao.getMenus();
        }catch (Exception e){
            return null;
        }

    }
    @Override
    public List<Department> getDemenus(Integer cid) {
        try{
            return menusDao.getDemenus(cid);
        }catch (Exception e){
            return null;
        }
    }

    @Override
    public List<PositionVo> getGmenus(Integer cid) {
        try{
            return menusDao.getGmenus(cid);
        }catch (Exception e){
            return null;
        }
    }

    @Override
    public List<Employee> getNamemenus(Integer cid) {
        try{
            return menusDao.getNamemenus(cid);
        }catch (Exception e){
            return null;
        }
    }
}
