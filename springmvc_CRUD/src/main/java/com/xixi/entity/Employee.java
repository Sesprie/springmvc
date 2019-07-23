package com.xixi.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Employee {


    private Integer id;
    private String name;
    private Integer age;
    private int sex;//female 0 male 1
    private Department department;
    private Date birth;


    public Employee(Integer id, String name, Integer age, int sex, Department department) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.department = department;
    }
}
