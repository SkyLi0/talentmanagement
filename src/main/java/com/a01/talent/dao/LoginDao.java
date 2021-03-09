package com.a01.talent.dao;

import com.a01.talent.po.LoginPo;
import com.a01.talent.vo.LoginVo;

public interface LoginDao {
    LoginPo findLogin(LoginVo loginVo);//登录
}
