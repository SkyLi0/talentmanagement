package com.a01.talent.biz.impl;

import com.a01.talent.biz.EmployeeBiz;
import com.a01.talent.dao.EmployeeDao;
import com.a01.talent.dao.WorkExperDao;
import com.a01.talent.po.Department;
import com.a01.talent.vo.Employee;
import com.a01.talent.vo.manage.WorkExper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeImpl implements EmployeeBiz {
    @Autowired
    private EmployeeDao employeeDao;
//    private WorkExperDao workExperDao;
    @Override
    public PageInfo getAll(Employee employee,int pageNum, int pageSize) {
        try{
            PageHelper.startPage(pageNum,pageSize);
            List<Employee> employeeList = employeeDao.getAll(employee);
            PageInfo pageInfo = new PageInfo(employeeList);
            return pageInfo;
        }catch (Exception e){
            return null;
        }
    }

    @Override
    public PageInfo getDeEmployee(Department department, int pageNum, int pageSize) {
        try{
            PageHelper.startPage(pageNum,pageSize);
            List<Employee> employeeList = employeeDao.getDeEmployee(department);
            PageInfo pageInfo = new PageInfo(employeeList);
            return pageInfo;
        }catch (Exception e){
            return null;
        }
    }

    @Override
    public PageInfo getPostion(Employee employee, int pageNum, int pageSize) {
        try{
            PageHelper.startPage(pageNum,pageSize);
            List<Employee> employeeList = employeeDao.getPostion(employee);
            PageInfo pageInfo = new PageInfo(employeeList);
            return pageInfo;
        }catch (Exception e){
            return null;
        }
    }

//    @Override
//    public List<Employee> getDeEmployee(Department department) {
//        try{
//            return employeeDao.getDeEmployee(department);
//        }catch (Exception e){
//            return null;
//        }
//
//    }
//
//    @Override
//    public List<Employee> getPostion(Employee employee) {
//        try{
//            return employeeDao.getPostion(employee);
//        }catch (Exception e){
//            return null;
//        }
//    }

    @Override
    public List<Employee> getOne(Employee employee) {
        try{
            return employeeDao.getOne(employee);
        }catch (Exception e){
            return null;
        }
    }

    @Override
    public Employee selectOneEmployee(Employee employee) {
        try{
            return employeeDao.selectOneEmployee(employee);
        }catch (Exception e){
            return null;
        }
    }

    @Override
    public Integer updateEmployee(Employee employee) {
        try{
            return employeeDao.updateEmployee(employee);
        }catch (Exception e){
            return null;
        }
    }

    @Override
    public Integer addDepartment(Department department) {
        try{
            return employeeDao.addDepartment(department);
        }catch (Exception e){
            return null;
        }
    }

    @Override
    public Integer updateEmployee1(WorkExper workExper) {
        try{
//            boolean i =workExperDao.updateWorkExper(workExper);
            return employeeDao.updateEmployee1(workExper);
        }catch (Exception e){
            return null;
        }
    }
}
