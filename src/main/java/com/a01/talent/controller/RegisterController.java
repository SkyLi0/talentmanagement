package com.a01.talent.controller;

import com.a01.talent.biz.RegiserBiz;
import com.a01.talent.vo.JsonVo;
import com.a01.talent.vo.Meta;
import com.a01.talent.vo.RegisterVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@Controller
public class RegisterController {
    @Autowired
    RegiserBiz regiserBiz;
    @PostMapping("/register/company")
    public @ResponseBody JsonVo registercom(@RequestBody RegisterVo registerVo, HttpServletRequest request){
        JsonVo jsonVo=new JsonVo();
        Meta meta=new Meta();
        //上传文件，公司凭证
        if(!registerVo.getFile().isEmpty()){
            String path=request.getServletContext().getRealPath("/upload");
            File file1=new File(path);
            if(!file1.exists()){
                file1.mkdirs();
            }
            File file2=new File(file1,registerVo.getFile().getOriginalFilename());
            try {
                registerVo.getFile().transferTo(file2);
                String name=registerVo.getFile().getOriginalFilename();
                path+="/"+name;
                registerVo.setCom_identity_path(path);
            } catch (IOException e) {
                e.printStackTrace();
            }
            //向数据库添加公司信息数据
            Boolean company=regiserBiz.addcompany(registerVo);
            if(company){
                meta.setStatus(200);
                meta.setMsg("公司信息注册成功");
            }
            else {
                meta.setStatus(400);
                meta.setMsg("公司信息注册失败");
            }
        }else {
            meta.setStatus(400);
            meta.setMsg("公司信息注册失败");
        }
        jsonVo.setMeta(meta);
        return jsonVo;
    }

    //用户信息注册
    @PostMapping("/register/user")
    public @ResponseBody JsonVo registeruser(@RequestBody RegisterVo registerVo){
        JsonVo jsonVo=new JsonVo();
        Meta meta=new Meta();
        Boolean b=regiserBiz.adduser(registerVo);
        if(!b){
            meta.setMsg("注册失败");
            meta.setStatus(400);
        }else {
            meta.setStatus(200);
            meta.setMsg("注册成功");
        }
        jsonVo.setMeta(meta);
        return  jsonVo;

    }

    //查询公司id
    @GetMapping("/register/{comid}")
    public@ResponseBody JsonVo findcompany(@PathVariable Integer comid) {
        JsonVo jsonVo=new JsonVo();
        Meta meta=new Meta();
        Integer id=0;
        id=regiserBiz.findcomid(comid);
        if(id!=0){
            meta.setStatus(400);
            meta.setMsg("公司信息已存在");
        }
        meta.setStatus(200);
        meta.setMsg("公司信息不存在");
        jsonVo.setMeta(meta);
        jsonVo.setData(id);
        return jsonVo;
    }

}
