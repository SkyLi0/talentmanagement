package com.a01.talent.biz;

import com.a01.talent.po.Department;
import com.a01.talent.po.Menus;
import com.a01.talent.po.PositionVo;
import com.a01.talent.vo.Employee;

import java.util.List;

public interface MenusBiz{
    List<Menus> getMenus();
    List<Department> getDemenus(Integer cid);

    List<PositionVo> getGmenus(Integer cid);

    List<Employee> getNamemenus(Integer cid);
}
