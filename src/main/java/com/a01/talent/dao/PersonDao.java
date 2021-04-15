package com.a01.talent.dao;

import com.a01.talent.po.PersonManage;
import com.a01.talent.vo.Employee;

import java.util.List;

public interface PersonDao {
    //查询所有人的档案信息
    List<PersonManage> getAllPerson();
    //搜索个人的信息
    List<PersonManage> getOnePerson(String phone);
//添加员工信息
    Integer insertEmployee(Employee employee);

    PersonManage selectOnePerson(Integer archive_id);
    Integer updatePerson(PersonManage personManage);
    Integer updatePerson1(PersonManage personManage);

}
