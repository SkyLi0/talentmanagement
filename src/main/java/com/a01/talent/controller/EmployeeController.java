package com.a01.talent.controller;

import com.a01.talent.biz.EmployeeBiz;
import com.a01.talent.biz.WorkExperBiz;
import com.a01.talent.po.Department;
import com.a01.talent.po.PageVO;
import com.a01.talent.vo.Employee;
import com.a01.talent.vo.JsonVo;
import com.a01.talent.vo.Meta;
import com.a01.talent.vo.QueryInfo;
import com.a01.talent.vo.manage.WorkExper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.EnumMap;
import java.util.List;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeBiz employeeBiz;
    private WorkExperBiz workExperBiz;
    //访问全部的员工信息 通过公司的id号
    @GetMapping("/employee/{id}")
    public @ResponseBody JsonVo getEmployee(@PathVariable Integer id,QueryInfo queryInfo) {
        JsonVo jsonVo = new JsonVo();
        Meta meta = new Meta();
        Employee employee = new Employee();
        employee.setCid(id);
        PageInfo pageInfo = new PageInfo();
        PageVO pageVos = new PageVO();
        List<Employee> employeeList = null;
        if (queryInfo.getQuery().isEmpty()) {
            pageInfo = employeeBiz.getAll(employee, queryInfo.getPagenum(), queryInfo.getPagesize());
            pageVos.setList(pageInfo.getList());
        } else {
            employee.setName(queryInfo.getQuery());
            employeeList = employeeBiz.getOne(employee);
            pageVos.setList(employeeList);
        }
        pageVos.setTotal(pageInfo.getTotal());
        pageVos.setPagenum(pageInfo.getPageNum());
        System.out.println("查询成功");
        if (pageVos.getList() == null) {
            meta.setStatus(400);
            meta.setMsg("获取员工信息失败");
        } else {
            meta.setMsg("获取员工信息成功");
            meta.setStatus(200);
        }
        jsonVo.setMeta(meta);
        jsonVo.setData(pageVos);
        return jsonVo;
    }
    //通过部门的id号查询其对应的员工列表

    @GetMapping("/department")
    public @ResponseBody JsonVo getDeEmployee(Department department,QueryInfo queryInfo){
        JsonVo jsonVo=new JsonVo();
        Meta meta=new Meta();
        PageVO pageVos = new PageVO();
        PageInfo pageInfo =employeeBiz.getDeEmployee(department,queryInfo.getPagenum(),queryInfo.getPagesize());
        if(pageInfo.getList()==null){
            meta.setStatus(400);
            meta.setMsg("获取员工信息失败");
        }else{
            meta.setMsg("获取员工信息成功");
            meta.setStatus(200);
        }
        pageVos.setTotal(pageInfo.getTotal());
        pageVos.setPagenum(pageInfo.getPageNum());
        pageVos.setList(pageInfo.getList());
        jsonVo.setMeta(meta);
        jsonVo.setData(pageVos);
        return jsonVo;
    }


//    @GetMapping("/department")
//    public @ResponseBody JsonVo getDeEmployee(Department department,QueryInfo queryInfo){
//        JsonVo jsonVo=new JsonVo();
//        Meta meta=new Meta();
//        PageVO employeeVO = new PageVO();
//        List<Employee> employeeList=employeeBiz.getDeEmployee(department);
//        if(employeeList==null){
//            meta.setStatus(400);
//            meta.setMsg("获取员工信息失败");
//        }else{
//            meta.setMsg("获取员工信息成功");
//            meta.setStatus(200);
//            if(employeeList.size()<queryInfo.getPagenum()*queryInfo.getPagesize()){
//                employeeList=employeeList.subList((queryInfo.getPagenum()-1)*queryInfo.getPagesize(),employeeList.size());
//            }else {
//                employeeList=employeeList.subList((queryInfo.getPagenum()-1)*queryInfo.getPagesize(),(queryInfo.getPagenum()*queryInfo.getPagesize()));
//            }
//            employeeVO.setEmployees(employeeList);
//            employeeVO.setTotal(employeeList.size());
//            employeeVO.setPagenum(queryInfo.getPagenum());
//        }
//        jsonVo.setMeta(meta);
//        jsonVo.setData(employeeVO);
//        return jsonVo;
//    }
    //通过公司的职位名称查询其对应的员工列表
    @GetMapping("/postion")
    public @ResponseBody JsonVo getPostion(Employee employee,QueryInfo queryInfo){
        JsonVo jsonVo=new JsonVo();
        Meta meta=new Meta();
        PageVO pageVos = new PageVO();
        PageInfo pageInfo =employeeBiz.getPostion(employee,queryInfo.getPagenum(),queryInfo.getPagesize());
        if(pageInfo.getList()==null){
            meta.setStatus(400);
            meta.setMsg("获取员工信息失败");
        }else{
            meta.setMsg("获取员工信息成功");
            meta.setStatus(200);
        }
        pageVos.setTotal(pageInfo.getTotal());
        pageVos.setPagenum(pageInfo.getPageNum());
        pageVos.setList(pageInfo.getList());
        jsonVo.setMeta(meta);
        jsonVo.setData(pageVos);
        return jsonVo;
    }
    //员工号查询
    @GetMapping("/employee/{cid}/{eid}")
    public @ResponseBody JsonVo selectOneEmployee(@PathVariable long cid,@PathVariable long eid){
        JsonVo jsonVo=new JsonVo();
        Meta meta=new Meta();
        Employee employee = new Employee();
        employee.setCid(cid);
        employee.setEid(eid);
        Employee employee1 =employeeBiz.selectOneEmployee(employee);
        if(employee1==null){
            meta.setStatus(400);
            meta.setMsg("获取员工信息失败");
        }else{
            meta.setMsg("获取员工信息成功");
            meta.setStatus(200);
        }
        jsonVo.setMeta(meta);
        jsonVo.setData(employee1);
        return jsonVo;
    }
    //修改员工信息
    @PutMapping("/employee/{cid}/{eid}")
    public @ResponseBody JsonVo updateEmployee(@PathVariable long cid,@PathVariable long eid,@RequestBody Employee employee){
        JsonVo jsonVo=new JsonVo();
        Meta meta=new Meta();
        employee.setCid(cid);
        employee.setEid(eid);
        Integer employee1 =employeeBiz.updateEmployee(employee);
        if(employee1==null){
            meta.setStatus(400);
            meta.setMsg("获取员工信息失败");
        }else{
            meta.setMsg("获取员工信息成功");
            meta.setStatus(200);
        }
        jsonVo.setMeta(meta);
        jsonVo.setData(employee1);
        return jsonVo;
    }
    //增加部门信息
    @PostMapping("/addDepart")
    public @ResponseBody JsonVo addDepartment(@RequestBody Department department){
        JsonVo jsonVo=new JsonVo();
        Meta meta=new Meta();
//        department.setCompany_id(cid);
        Integer employee1 =employeeBiz.addDepartment(department);
        if(employee1==null){
            meta.setStatus(400);
            meta.setMsg("增加部门信息失败");
        }else{
            meta.setMsg("增加部门信息成功");
            meta.setStatus(200);
        }
        jsonVo.setMeta(meta);
        jsonVo.setData(employee1);
        return jsonVo;
    }
    //删除员工信息
    @PutMapping("/employee")
    public  @ResponseBody JsonVo updateEmployee1(@RequestBody  WorkExper workExper){
        JsonVo jsonVo=new JsonVo();
        Meta meta=new Meta();
//        department.setCompany_id(cid);
        Integer employee1 =employeeBiz.updateEmployee1(workExper);
//        boolean e = workExperBiz.updateWorkExper(workExper);
        if(employee1==null){
            meta.setStatus(400);
            meta.setMsg("删除员工信息失败");
        }else{
            meta.setMsg("删除员工信息成功");
            meta.setStatus(200);
        }
        jsonVo.setMeta(meta);
        jsonVo.setData(employee1);
        return jsonVo;
    }
}
