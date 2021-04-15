package com.a01.talent.controller;

import com.a01.talent.biz.MenusBiz;
import com.a01.talent.po.Department;
import com.a01.talent.po.Menus;
import com.a01.talent.po.PositionVo;
import com.a01.talent.vo.Employee;
import com.a01.talent.vo.JsonVo;
import com.a01.talent.vo.Meta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MenusController {
    @Autowired
    private MenusBiz menusBiz;
    @GetMapping("/menus")
    public @ResponseBody JsonVo getMenus(){
        JsonVo jsonVo = new JsonVo();
        Meta meta = new Meta();
        System.out.println("成功");
        List<Menus> menusList = menusBiz.getMenus();
        if(menusList==null){
            meta.setMsg("获取菜单失败");
            meta.setStatus(400);
        }else{
            meta.setStatus(200);
            meta.setMsg("获取菜单成功");
        }
        jsonVo.setData(menusList);
        jsonVo.setMeta(meta);
        return jsonVo;
    }
    //根据部门的信息将每一个部门列出来
    @GetMapping("/demenus/{cid}")
    public @ResponseBody JsonVo getDemenus(@PathVariable Integer cid){
        JsonVo jsonVo = new JsonVo();
        Meta meta = new Meta();
        System.out.println("成功");
        List<Department> departmentList =menusBiz.getDemenus(cid);
        if(departmentList==null){
            meta.setMsg("获取部门菜单失败");
            meta.setStatus(400);
        }else{
            meta.setStatus(200);
            meta.setMsg("获取部门菜单成功");
        }
        jsonVo.setData(departmentList);
        jsonVo.setMeta(meta);
        return jsonVo;
    }
    //根据职位名查询
    @GetMapping("/postion/{cid}")
    public @ResponseBody JsonVo getGmenus(@PathVariable Integer cid){
        JsonVo jsonVo = new JsonVo();
        Meta meta = new Meta();
        System.out.println("成功");
        List<PositionVo> positionVos =menusBiz.getGmenus(cid);
        if(positionVos==null){
            meta.setMsg("获取职位菜单失败");
            meta.setStatus(400);
        }else{
            meta.setStatus(200);
            meta.setMsg("获取职位菜单成功");
        }
        jsonVo.setData(positionVos);
        jsonVo.setMeta(meta);
        return jsonVo;
    }
    @GetMapping("/lnamne/{cid}")
    public @ResponseBody JsonVo getNamemenus(@PathVariable Integer cid){
        JsonVo jsonVo = new JsonVo();
        Meta meta = new Meta();
        System.out.println("成功");
        List<Employee> employeeList =menusBiz.getNamemenus(cid);
        if(employeeList==null){
            meta.setMsg("获取负责人菜单失败");
            meta.setStatus(400);
        }else{
            meta.setStatus(200);
            meta.setMsg("获取负责人菜单成功");
        }
        jsonVo.setData(employeeList);
        jsonVo.setMeta(meta);
        return jsonVo;
    }
}
