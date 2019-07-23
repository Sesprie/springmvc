package com.xixi.dao;


import com.xixi.entity.Department;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class DepartmentDao {

    public static Map<Integer, Department>  departments = null;
    static{
        departments = new HashMap<>();
        departments.put(1,new Department(1,"A"));
        departments.put(2,new Department(2,"B"));
        departments.put(3,new Department(3,"C"));
        departments.put(4,new Department(4,"D"));
        departments.put(5,new Department(5,"E"));

    }

    public Collection<Department> getAll(){
        return departments.values();
    }


    public Department getDepartment(Integer id){
        return departments.get(id);
    }
}
