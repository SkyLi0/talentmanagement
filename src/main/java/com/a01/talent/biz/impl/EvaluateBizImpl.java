package com.a01.talent.biz.impl;

import com.a01.talent.biz.EvaluateBiz;
import com.a01.talent.dao.EvaluateDao;
import com.a01.talent.vo.manage.EvaluatePo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EvaluateBizImpl implements EvaluateBiz {
    @Autowired
    private EvaluateDao evaluateDao;
    @Override
    public List<EvaluatePo> findAllEvaluate(Long com_id) {
        try {
            return evaluateDao.findAllEvaluate(com_id);
        }catch (Exception e){
            return null;
        }
    }

    @Override
    public boolean insertEvaluate(EvaluatePo evaluatePo) {
        return evaluateDao.insertEvaluate(evaluatePo);
    }
}
