package com.a01.talent.controller;

import com.a01.talent.biz.WorkExperBiz;
import com.a01.talent.vo.JsonVo;
import com.a01.talent.vo.Meta;
import com.a01.talent.vo.manage.WorkExper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WorkExperController {
    @Autowired
    private WorkExperBiz workExperBiz;

    @PostMapping("/workexper/add")
    public @ResponseBody JsonVo addWorkExper(@RequestBody WorkExper workExper){
        JsonVo jsonVo=new JsonVo();
        Meta meta=new Meta();
        Boolean b=workExperBiz.addWorkExper(workExper);
        if(b){
            meta.setMsg("添加工作经历成功");
            meta.setStatus(200);
        }else {
            meta.setMsg("添加工作经历失败");
            meta.setStatus(400);
        }
        jsonVo.setMeta(meta);
        return jsonVo;
    }

    @PutMapping("/workexper/update")
    public @ResponseBody JsonVo updateWorkExper(@RequestBody WorkExper workExper){
        JsonVo jsonVo=new JsonVo();
        Meta meta=new Meta();
        Boolean b=workExperBiz.updateWorkExper(workExper);
        if(b){
            meta.setMsg("添加工作经历成功");
            meta.setStatus(200);
        }else {
            meta.setMsg("添加工作经历失败");
            meta.setStatus(400);
        }
        jsonVo.setMeta(meta);
        return jsonVo;
    }
}
