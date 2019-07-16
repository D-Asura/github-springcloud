package com.dragon.githubspringcloud.entity;

import lombok.Data;

@Data
public class Staff {
    private Integer id;
    private String name;
    private String gender;
    private String phoneNum;
    private Integer age;
    private String department;
    private String address;
}
