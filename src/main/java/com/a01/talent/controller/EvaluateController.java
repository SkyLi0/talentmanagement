package com.a01.talent.controller;

import com.a01.talent.biz.EmployeeBiz;
import com.a01.talent.biz.EvaluateBiz;
import com.a01.talent.po.EmployeePo;
import com.a01.talent.po.EvaluatePo;
import com.a01.talent.vo.JsonVo;
import com.a01.talent.vo.Meta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class EvaluateController {

    @Autowired
    private EvaluateBiz evaluateBiz;
    private EmployeeBiz employeeBiz;

    //查询所有评价
    @GetMapping("/evaluate/{com_id}")
    public @ResponseBody
    JsonVo findAllEvaluate(@PathVariable Long com_id){
        JsonVo jsonVo=new JsonVo();
        Meta meta=new Meta();
        List<EvaluatePo> list=null;
        list=evaluateBiz.findAllEvaluate(com_id);
        if(list==null){
            meta.setMsg("获取评价信息失败");
            meta.setStatus(400);
        }else {
            meta.setStatus(200);
            meta.setMsg("获取评价信息成功");
        }
        jsonVo.setMeta(meta);
        jsonVo.setData(list);
        return jsonVo;
    }

    //被评员工选择（下拉框）
    @GetMapping("/dnumber/employee/{com_id}")
    public  @ResponseBody
    JsonVo findEmployee(@PathVariable Long com_id){
        JsonVo jsonVo=new JsonVo();
        Meta meta=new Meta();
        List<EmployeePo> list=null;
        list=employeeBiz.findAllEmployee(com_id);
        if(list==null){
            meta.setMsg("获取员工下拉框失败");
            meta.setStatus(400);
        }else {
            meta.setStatus(200);
            meta.setMsg("获取员工下拉框成功");
        }
        jsonVo.setMeta(meta);
        jsonVo.setData(list);
        return jsonVo;
    }

    //添加评价
    @PostMapping("/evaluate/add")
    public @ResponseBody
    JsonVo insertEvaluate(@RequestBody EvaluatePo evaluatePo){
        JsonVo jsonVo=new JsonVo();
        Meta meta=new Meta();
        Boolean b=evaluateBiz.insertEvaluate(evaluatePo);
        if(b){
            meta.setMsg("添加评价成功");
            meta.setStatus(200);
        }else {
            meta.setStatus(400);
            meta.setMsg("添加评价失败");
        }
        jsonVo.setMeta(meta);
        jsonVo.setData(b);
        return jsonVo;
    }
}
