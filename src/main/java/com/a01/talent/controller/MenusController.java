package com.a01.talent.controller;

import com.a01.talent.biz.MenusBiz;
import com.a01.talent.po.Menus;
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
    @GetMapping("/menus/{roleId}")
    public @ResponseBody JsonVo getMenus(@PathVariable Integer roleId){
        JsonVo jsonVo = new JsonVo();
        Meta meta = new Meta();
        System.out.println("成功");
        System.out.println(roleId);
        List<Menus> menusList = menusBiz.getMenus(roleId);
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
}
