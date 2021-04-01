package com.a01.talent.biz.impl;

import com.a01.talent.biz.ImportantBiz;
import com.a01.talent.dao.ImportantDao;
import com.a01.talent.po.ImportantPo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImportantBizImpl implements ImportantBiz {
    @Autowired
    private ImportantDao importantDao;
    @Override
    public List<ImportantPo> findAllImportant(Long com_id) {
        try {
            return importantDao.findAllImportant(com_id);
        }catch (Exception e){
            return null;
        }
    }

    @Override
    public List<ImportantPo> findExcellent(Long com_id) {
        try {
            return importantDao.findExcellent(com_id);
        }catch (Exception e){
            return null;
        }
    }

    @Override
    public List<ImportantPo> findViolation(Long com_id) {
        try {
            return importantDao.findViolation(com_id);
        }catch (Exception e){
            return null;
        }
    }

    @Override
    public Boolean insertImportant(ImportantPo importantPo) {
        return importantDao.insertImportant(importantPo);
    }
}
