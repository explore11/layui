package com.example.layui.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String id;
    private String name;
    private String nikename;
    private String password;
    private String job;
    private String email;
    private String phone;
    private String address;
    private int status;
    private String remarks;
    private Date cdt;
    private Date udt;
    private String creatorId;
}
