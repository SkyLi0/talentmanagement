package com.a01.talent.biz;

import com.a01.talent.po.Department;
import com.a01.talent.vo.Employee;
import com.a01.talent.vo.manage.WorkExper;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface EmployeeBiz {
//    List<Employee> getAll(Employee employee);
    PageInfo getAll(Employee employee,int pageNum,int pageSize);
    PageInfo getDeEmployee(Department department,int pageNum,int pageSize);

    PageInfo getPostion(Employee employee,int pageNum,int pageSize);

    List<Employee> getOne(Employee employee);

    Employee selectOneEmployee(Employee employee);

    Integer updateEmployee(Employee employee);

    Integer addDepartment(Department department);

    Integer updateEmployee1(WorkExper workExper);
}
