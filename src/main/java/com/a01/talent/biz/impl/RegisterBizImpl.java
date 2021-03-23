package com.a01.talent.biz.impl;

import com.a01.talent.biz.RegiserBiz;
import com.a01.talent.dao.RegisterDao;
import com.a01.talent.vo.RegisterVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterBizImpl implements RegiserBiz {
    @Autowired
    RegisterDao registerDao;

    @Override
    public Boolean addcompany(RegisterVo registerVo) {
        return registerDao.addcompany(registerVo);
    }

    @Override
    public Boolean adduser(RegisterVo registerVo) {
        return registerDao.adduser(registerVo);
    }

    @Override
    public Integer findcomid(Integer comid) {
        try {
            return registerDao.findcomid(comid);
        }catch (Exception e){
            return null;
        }
    }
}
