package com.a01.talent.biz.impl;

import com.a01.talent.biz.WorkExperBiz;
import com.a01.talent.dao.WorkExperDao;
import com.a01.talent.vo.manage.WorkExper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkExperBizImpl implements WorkExperBiz {
    @Autowired
    private WorkExperDao workExperDao;
    @Override
    public Boolean addWorkExper(WorkExper workExper) {
        return workExperDao.addWorkExper(workExper);
    }

    @Override
    public Boolean updateWorkExper(WorkExper workExper) {
        return workExperDao.updateWorkExper(workExper);
    }
}
