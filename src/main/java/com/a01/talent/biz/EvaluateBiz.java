package com.a01.talent.biz;

import com.a01.talent.vo.manage.EvaluatePo;

import java.util.List;

public interface EvaluateBiz {
    List<EvaluatePo> findAllEvaluate(Long com_id);
    boolean insertEvaluate(EvaluatePo evaluatePo);
}
