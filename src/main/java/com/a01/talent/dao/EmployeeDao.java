package com.a01.talent.dao;

import com.a01.talent.po.Department;
import com.a01.talent.vo.Employee;
import com.a01.talent.vo.manage.WorkExper;

import java.util.List;

public interface EmployeeDao {
    List<Employee> getAll(Employee employee);
    List<Employee> getDeEmployee(Department department);

    List<Employee> getPostion(Employee employee);

    List<Employee> getOne(Employee employee);

    Employee selectOneEmployee(Employee employee);
    Integer updateEmployee(Employee employee);
    Integer addDepartment(Department department);
    Integer updateEmployee1(WorkExper workExper);
}
