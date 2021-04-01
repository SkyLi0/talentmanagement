package com.a01.talent.dao;

import com.a01.talent.po.EmployeePo;

import java.util.List;

public interface EmployeeDao {
    List<EmployeePo> findAllEmployee(Long com_id);
}
