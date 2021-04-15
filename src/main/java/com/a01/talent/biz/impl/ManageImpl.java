package com.a01.talent.biz.impl;

import com.a01.talent.biz.PersonBiz;
import com.a01.talent.dao.PersonDao;
import com.a01.talent.po.PersonManage;
import com.a01.talent.vo.Employee;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManageImpl implements PersonBiz {
    @Autowired
    private PersonDao personDao;
//    @Override
//    public List<PersonManage> getAllPerson() {
//        try {
//            return personDao.getAllPerson();
//        }catch (Exception e){
//            return  null;
//        }
//    }

    @Override
    public PageInfo getAllPerson(int pageNum, int pageSize) {
        try{
            PageHelper.startPage(pageNum,pageSize);
            List<PersonManage> personManages = personDao.getAllPerson();
            PageInfo pageInfo = new PageInfo(personManages);
            return pageInfo;
        }catch (Exception e){
            return null;
        }
    }

    @Override
    public List<PersonManage> getOnePerson(String phone) {
        try{
            return personDao.getOnePerson(phone);
        }catch (Exception e){
            return null;
        }
    }

    @Override
    public PersonManage selectOnePerson(Integer archive_id) {
        try{
            return personDao.selectOnePerson(archive_id);
        }catch (Exception e){
            return null;
        }
    }

    @Override
    public Integer insertEmployee(Employee employee) {
        try{
            return personDao.insertEmployee(employee);
        }catch (Exception e){
            return null;
        }
    }

    @Override
    public Integer updatePerson(PersonManage personManage) {
        try{
            return personDao.updatePerson(personManage);
        }catch (Exception e){
            return null;
        }
    }
    @Override
    public Integer updatePerson1(PersonManage personManage) {
        try{
            return personDao.updatePerson1(personManage);
        }catch (Exception e){
            return null;
        }
    }
}
