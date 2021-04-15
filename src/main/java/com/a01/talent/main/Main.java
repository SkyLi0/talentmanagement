package com.a01.talent.main;

import com.a01.talent.dao.EmployeeDao;
import com.a01.talent.dao.MenusDao;
import com.a01.talent.dao.PersonDao;
import com.a01.talent.po.Department;
import com.a01.talent.po.Menus;
import com.a01.talent.po.PersonManage;
import com.a01.talent.po.PositionVo;
import com.a01.talent.vo.Employee;
import com.sun.org.apache.xml.internal.serialize.LineSeparator;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml"; // 定义主配值文件的路径全名
        // 使用mybatis的Resources来读取主配置文件，并转换成流对象
        InputStream is = Resources.getResourceAsStream(resource);
        // 通过主配值文件的流对象来构建MyBatyis的核心工厂象
        SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(is);
        // 通过工厂对象获取一个与数据库的连接对象(Mybatis封装的)
        SqlSession session = sf.openSession();
//        StudentDao stu=session.getMapper(StudentDao.class);
        //查询部门员工
//        EmpDao empDao=session.getMapper(EmpDao.class);
//        List<EmployeePo> list=empDao.getemp();
//        for(EmployeePo employeePo:list){
//            System.out.println(employeePo);
//        }
//        System.out.println(stu.getStuById("3"));

        //查询菜单栏
//        MenusDao menusDao=session.getMapper(MenusDao.class);
//        List<Menus> menus=menusDao.getMenus();
//        for(Menus menus1:menus){
//            System.out.println(menus1.toString());
//        }
//员工信息查询
//        EmployeeDao employeeDao  = session.getMapper(EmployeeDao.class);
//        Employee employee  = new Employee();
//        employee.setName("王红花");
//        employee.setEmp_position("hr");
//        employee.setCid(1);
//        Department department = new Department();
//        department.setCompany_id(1);
//        department.setDnumber(6);
//        Employee employee = new Employee();
//        employee.setCid(1);
//        List<Employee> employeeList = employeeDao.getOne(employee);
//        System.out.println(employeeList.toString());
        //查询人管理信息全部信息
        PersonDao personDao = session.getMapper(PersonDao.class);
//        PersonManage personManage = personDao.getOnePerson(13324244545l);
//        System.out.println(personManage.toString());
        List<PersonManage> personManages = personDao.getAllPerson();
        for(PersonManage per:personManages){
            System.out.println(per.toString());
        }
//添加员工信息
//        PersonDao personDao = session.getMapper(PersonDao.class);
//        Employee employee =
//                new Employee(8,11,1,"柞木","男","1999-10-06",523234199910079636l
//                        ,"员工",15222524536l,1,1,"1522@qq.mail","四川");
//        employee.setName("五丰田");
//
//        Integer i = personDao.insertEmployee(employee);
        //查询评价
//        EvaluateDao evaluateDao=session.getMapper(EvaluateDao.class);
//        List<EvaluatePo> list=evaluateDao.findAllEvaluate(2);
//        for(EvaluatePo evaluatePo:list){
//            System.out.println(evaluatePo);
//        }

        //添加评价
//        EvaluateDao evaluateDao=session.getMapper(EvaluateDao.class);
//        EvaluatePo evaluatePo=new EvaluatePo();
//        evaluatePo.setCom_id(2);evaluatePo.setArchive_id(3);evaluatePo.setEmployee_id(23546);evaluatePo.setEvaluate("踏实认真");evaluatePo.setEva_date(new Date());
//        Boolean b=evaluateDao.insertevaluate(evaluatePo);
//        System.out.println(b);
//        session.commit();

        //查询重大事件
//        ImportantDao importantDao=session.getMapper(ImportantDao.class);
//        List<ImportantPo> list=importantDao.findAllImportant(1l);
//        for (ImportantPo importantPo:list){
//            System.out.println(importantPo);
//        }
//部门菜单栏的展现
//        MenusDao menusDao=session.getMapper(MenusDao.class);
//        List<Department> menus=menusDao.getDemenus(1);
//        for(Department menus1:menus){
//            System.out.println(menus1.toString());
//        }
//        职位菜单兰展示
//        List<PositionVo> menus=menusDao.getGmenus(1);
//        for(PositionVo menus1:menus){
//            System.out.println(menus1.toString());
//        }
        //添加重大事件
//        ImportantDao importantDao=session.getMapper(ImportantDao.class);
//        ImportantPo importantPo=new ImportantPo();
//        importantPo.setCom_id((long)1);importantPo.setArchive_id((long)1);importantPo.setEmployee_id(202034563456l);importantPo.setState(1);importantPo.setExcellent_thing("在项目后期发现重大风险，为项目顺利完成作出突出贡献");
//        importantPo.setRecord_time(new Date());
//        Boolean b=importantDao.insertImportant(importantPo);
//        System.out.println(b);
//        session.commit();
        session.close();
    }
}
