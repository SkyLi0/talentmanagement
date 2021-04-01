package com.a01.talent.biz;

import com.a01.talent.po.EmployeePo;

import java.util.List;

public interface EmployeeBiz {
    List<EmployeePo> findAllEmployee(Long com_id);
}
