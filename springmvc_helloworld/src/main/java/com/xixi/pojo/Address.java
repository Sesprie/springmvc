package com.xixi.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;





@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Address {

    private String province;
    private String city;

}
