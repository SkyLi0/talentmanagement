package com.a01.talent.biz;

import com.a01.talent.po.LoginPo;
import com.a01.talent.vo.LoginVo;

public interface LoginBiz {
    LoginPo findLogin(LoginVo loginVo);
}
