package com.xixi.dao;


import com.xixi.entity.Department;
import com.xixi.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class EmployeeDao {



    private static Map<Integer, Employee> employees = null;


    static{
        employees = new HashMap<>();
        employees.put(1,new Employee(1,"张三1", 14,1,new Department(1,"A")));
        employees.put(2,new Employee(2,"zhangsan2", 11,1,new Department(2,"B")));
        employees.put(3,new Employee(3,"zhangsan3", 14,0,new Department(3,"C")));
        employees.put(4,new Employee(4,"zhangsan4", 19,1,new Department(4,"D")));
        employees.put(5,new Employee(5,"zhangsan5", 12,0,new Department(5,"E")));
        employees.put(6,new Employee(6,"zhangsan6", 11,0,new Department(6,"A")));
    }

    private static int initId = 7;


    public void add(Employee e){
        if(e.getId() == null){
            e.setId(initId++);
        }
        e.setDepartment(DepartmentDao.departments.get(e.getDepartment().getId()));
        employees.put(e.getId(), e);
    }



    public Collection<Employee> getAll(){
        return employees.values();
    }


    public Employee getEmployee(Integer id){
        return employees.get(id);
    }



    public void delEmployee(Integer id){
        employees.remove(id);
    }

}
