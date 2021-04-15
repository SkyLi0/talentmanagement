package com.a01.talent.controller;

import com.a01.talent.biz.PersonBiz;
import com.a01.talent.po.PageVO;
import com.a01.talent.po.PersonManage;
import com.a01.talent.vo.Employee;
import com.a01.talent.vo.JsonVo;
import com.a01.talent.vo.Meta;
import com.a01.talent.vo.QueryInfo;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//查询档案信息库
@Controller
public class PersonManController {
    @Autowired
    private PersonBiz personBiz;
//查询所有的档案信息
    @GetMapping("/person")
    public @ResponseBody JsonVo getAllPerson(QueryInfo queryInfo){
        JsonVo jsonVo=new JsonVo();
        Meta meta=new Meta();
        PageInfo personManage = new PageInfo();
        if(queryInfo.getQuery().isEmpty()){
            personManage = personBiz.getAllPerson(queryInfo.getPagenum(),queryInfo.getPagesize());
        }else{
            List<PersonManage> personManages = personBiz.getOnePerson(queryInfo.getQuery());
            personManage.setList(personManages);
        }
        if(personManage==null){
            meta.setMsg("查询失败");
            meta.setStatus(400);
        }else{
            meta.setMsg("查询成功");
            meta.setStatus(200);
        }
        PageVO pageVO = new PageVO(personManage.getTotal(),personManage.getPageNum(),personManage.getList());
        jsonVo.setMeta(meta);
        jsonVo.setData(pageVO);
        return jsonVo;
    }
//    搜索单个人的档案信息
    @GetMapping("/person/{archive_id}")
    public @ResponseBody JsonVo selectOnePerson(@PathVariable Integer archive_id){
        JsonVo jsonVo=new JsonVo();
        Meta meta=new Meta();
        PersonManage personManage = personBiz.selectOnePerson(archive_id);
        if(personManage==null){
           meta.setMsg("查询失败");
            meta.setStatus(400);
     }else{
         meta.setMsg("查询成功");
         meta.setStatus(200);
     }
      jsonVo.setMeta(meta);
      jsonVo.setData(personManage);
      return jsonVo;
    }
    //添加入职信息
    @PostMapping("/person")
    public @ResponseBody JsonVo insertEmployee(@RequestBody Employee employee){
        JsonVo jsonVo=new JsonVo();
        Meta meta=new Meta();
//        Employee employee = new Employee();
//        PersonManage personManage1 = personBiz.insertEmployee(personManage);
        Integer b = personBiz.insertEmployee(employee);
        if(b==0){
            meta.setMsg("添加失败");
            meta.setStatus(400);
        }else{
            meta.setMsg("添加成功");
            meta.setStatus(200);
        }
        jsonVo.setMeta(meta);
        jsonVo.setData(employee);
        return jsonVo;
    }
    @PutMapping("/person")
    public @ResponseBody JsonVo updatePerson(@RequestBody PersonManage personManage){
        JsonVo jsonVo=new JsonVo();
        Meta meta=new Meta();
//        Employee employee = new Employee();
//        PersonManage personManage1 = personBiz.insertEmployee(personManage);
        Integer b = personBiz.updatePerson(personManage);
        if(b==0){
            meta.setMsg("添加失败");
            meta.setStatus(400);
        }else{
            meta.setMsg("添加成功");
            meta.setStatus(200);
        }
        jsonVo.setMeta(meta);
        jsonVo.setData(b);
        return jsonVo;
    }
    @PutMapping("/person1")
    public @ResponseBody JsonVo updatePerson1(@RequestBody PersonManage personManage){
        JsonVo jsonVo=new JsonVo();
        Meta meta=new Meta();
        Integer b = personBiz.updatePerson1(personManage);
        if(b==0){
            meta.setMsg("修改失败");
            meta.setStatus(400);
        }else{
            meta.setMsg("修改成功");
            meta.setStatus(200);
        }
        jsonVo.setMeta(meta);
        jsonVo.setData(b);
        return jsonVo;
    }
}
