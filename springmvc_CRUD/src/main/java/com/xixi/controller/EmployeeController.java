package com.xixi.controller;


import com.xixi.dao.DepartmentDao;
import com.xixi.dao.EmployeeDao;
import com.xixi.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
public class EmployeeController {


    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private DepartmentDao departmentDao;


    //获取所有emp
    @RequestMapping(value = "/emps")
    public String list(Map<String, Object> map){
        map.put("employees", employeeDao.getAll());
        return "list";

    }



    //转到添加emp页面
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addUI(Map<String, Object> map){
//        request.setAttribute("departments", departmentDao.getAll());
//        request.setAttribute("employee",new Employee());
        map.put("departments", departmentDao.getAll());
        map.put("employee",new Employee());
        return "add";
    }




    //添加一个emp
    @RequestMapping(value = "/emp", method = RequestMethod.POST)
    public String add(Employee e){
        employeeDao.add(e);
        return "redirect:/emps";
    }



    //删除一个emp
    @RequestMapping(value = "/emp/{id}", method = RequestMethod.DELETE)
    public String del(@PathVariable("id") Integer id){
        employeeDao.delEmployee(id);
        return "redirect:/emps";
    }


    //跳转到编辑页面
    @RequestMapping(value = "/emp/{id}")
    public String edit(@PathVariable("id") Integer id, Map<String, Object> map){
        map.put("employee", employeeDao.getEmployee(id));//与form表单中的modelAttribute属性值一致
        map.put("departments", DepartmentDao.departments.values());
        return "add";
    }


    //编辑一个emp
    @RequestMapping(value = "/emp", method = RequestMethod.PUT)
    public String edit(Employee e){
        employeeDao.add(e);
        System.out.println(e);
        return "redirect:/emps";
    }

}


/*
put 更新
delete 删除
post 添加
get 获取
 */