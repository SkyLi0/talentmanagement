package com.a01.talent.biz;

import com.a01.talent.vo.manage.ImportantPo;

import java.util.List;

public interface ImportantBiz {
    List<ImportantPo> findAllImportant(Long com_id);
    List<ImportantPo> findExcellent(Long com_id);
    List<ImportantPo> findViolation(Long com_id);
    Boolean insertImportant(ImportantPo importantPo);
}
