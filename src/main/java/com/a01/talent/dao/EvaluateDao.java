package com.a01.talent.dao;

import com.a01.talent.po.EvaluatePo;

import java.util.List;

public interface EvaluateDao {
    List<EvaluatePo> findAllEvaluate(Long com_id);
    boolean insertEvaluate(EvaluatePo evaluatePo);
}
