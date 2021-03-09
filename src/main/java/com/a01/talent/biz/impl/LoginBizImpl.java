package com.a01.talent.biz.impl;

import com.a01.talent.biz.LoginBiz;
import com.a01.talent.dao.LoginDao;
import com.a01.talent.po.LoginPo;
import com.a01.talent.vo.LoginVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginBizImpl implements LoginBiz {
    @Autowired
    private LoginDao loginDao;
    @Override
    public LoginPo findLogin(LoginVo loginVo) {
        try {
            return loginDao.findLogin(loginVo);
        }catch (Exception e){
            return null;
        }
    }
}
