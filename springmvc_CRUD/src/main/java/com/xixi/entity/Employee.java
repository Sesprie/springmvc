package com.xixi.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Employee {


    private Integer id;
    private String name;
    private Integer age;
    private int sex;//female 0 male 1
    private Department department;
}
