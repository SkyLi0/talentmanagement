package com.a01.talent.dao;

import com.a01.talent.vo.RegisterVo;

public interface RegisterDao {
    Boolean addcompany(RegisterVo registerVo);  //添加公司信息
    Boolean adduser(RegisterVo registerVo);     //添加注册用户名和密码
    Integer findcomid(Integer comid);           //查询公司编号
}
