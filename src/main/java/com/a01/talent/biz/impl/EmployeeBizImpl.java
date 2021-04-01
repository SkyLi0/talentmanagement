package com.a01.talent.biz.impl;

import com.a01.talent.biz.EmployeeBiz;
import com.a01.talent.dao.EmployeeDao;
import com.a01.talent.po.EmployeePo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeBizImpl implements EmployeeBiz {
    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public List<EmployeePo> findAllEmployee(Long com_id) {
        try {
            return employeeDao.findAllEmployee(com_id);
        }catch (Exception e){
            return null;
        }
    }
}
