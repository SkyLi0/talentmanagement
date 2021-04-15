package com.a01.talent.controller;

import com.a01.talent.biz.LoginBiz;
import com.a01.talent.po.LoginPo;
import com.a01.talent.utils.JwtUtils;
import com.a01.talent.vo.JsonVo;
import com.a01.talent.vo.LoginVo;
import com.a01.talent.vo.Meta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Controller
public class LoginController {
    @Autowired
    private LoginBiz loginBiz;
    @Autowired
    private JwtUtils jwtUtils;
    @PostMapping("/login")
    public @ResponseBody JsonVo login(@RequestBody LoginVo loginVo){
        System.out.println(loginVo.getUsername());
        LoginPo loginPo=loginBiz.findLogin(loginVo);
        JsonVo jsonVo=new JsonVo();
        Meta meta=new Meta();
        if(loginPo==null){
            meta.setStatus(400);
            meta.setMsg("用户名或密码错误");
        }else{
            meta.setMsg("登录成功");
            meta.setStatus(200);
            String subject=loginPo.getUser();
            Map<String, Object> map = new HashMap<>();
            map.put("login",loginPo);
            String token= jwtUtils.createJWT(UUID.randomUUID().toString(),subject,60*60*24*1000,map);
            loginPo.setToken(token);
        }
        jsonVo.setMeta(meta);
        jsonVo.setData(loginPo);
        return jsonVo;
    }
}
