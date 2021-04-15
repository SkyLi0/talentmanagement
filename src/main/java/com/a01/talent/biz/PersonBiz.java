package com.a01.talent.biz;

import com.a01.talent.po.PersonManage;
import com.a01.talent.vo.Employee;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface PersonBiz {

//    List<PersonManage> getAllPerson();
    PageInfo getAllPerson(int pageNum, int pageSize);
    List<PersonManage> getOnePerson(String phone);
    PersonManage selectOnePerson(Integer archive_id);
    Integer insertEmployee(Employee employee);

    Integer updatePerson(PersonManage personManage);
    Integer updatePerson1(PersonManage personManage);
}
