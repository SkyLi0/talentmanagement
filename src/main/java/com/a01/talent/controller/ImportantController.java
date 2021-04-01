package com.a01.talent.controller;

import com.a01.talent.biz.ImportantBiz;
import com.a01.talent.po.ImportantPo;
import com.a01.talent.vo.JsonVo;
import com.a01.talent.vo.Meta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

public class ImportantController {
    @Autowired
    private ImportantBiz importantBiz;

    //查询所有重大事件
    @GetMapping("/important/{com_id}")
    public @ResponseBody
    JsonVo findAllImportant(@PathVariable Long com_id){
        JsonVo jsonVo=new JsonVo();
        Meta meta=new Meta();
        List<ImportantPo> list=importantBiz.findAllImportant(com_id);
        if(list==null){
            meta.setMsg("查询失败");
            meta.setStatus(400);
        }else {
            meta.setMsg("查询成功");
            meta.setStatus(200);
        }
        jsonVo.setData(list);
        jsonVo.setMeta(meta);
        return jsonVo;
    }

    //查询优秀的重大事件
    @GetMapping("/important/excellent/{com_id}")
    public @ResponseBody
    JsonVo selectExcellent(@PathVariable Long com_id){
        JsonVo jsonVo=new JsonVo();
        Meta meta=new Meta();
        List<ImportantPo> list=importantBiz.findExcellent(com_id);
        if(list==null){
            meta.setMsg("查询失败");
            meta.setStatus(400);
        }else {
            meta.setMsg("查询成功");
            meta.setStatus(200);
        }
        jsonVo.setData(list);
        jsonVo.setMeta(meta);
        return jsonVo;
    }

    //查询违纪的重大事件
    @GetMapping("/important/violation/{com_id}")
    public  @ResponseBody
    JsonVo selectViolation(@PathVariable Long com_id){
        JsonVo jsonVo=new JsonVo();
        Meta meta=new Meta();
        List<ImportantPo> list=importantBiz.findViolation(com_id);
        if(list==null){
            meta.setMsg("查询失败");
            meta.setStatus(400);
        }else {
            meta.setMsg("查询成功");
            meta.setStatus(200);
        }
        jsonVo.setData(list);
        jsonVo.setMeta(meta);
        return jsonVo;
    }

    //添加重大事件(包括优秀和违纪)
    @PostMapping("/important/add")
    public @ResponseBody
    JsonVo insertImportan(ImportantPo importantPo){
        JsonVo jsonVo=new JsonVo();
        Meta meta=new Meta();
        Boolean b=importantBiz.insertImportant(importantPo);
        if(b){
            meta.setStatus(200);
            meta.setMsg("添加成功");
        }else {
            meta.setMsg("添加失败");
            meta.setStatus(400);
        }
        jsonVo.setMeta(meta);
        return jsonVo;
    }
}
