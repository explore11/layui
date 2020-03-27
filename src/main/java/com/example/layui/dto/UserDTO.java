package com.example.layui.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO<T> {
    private int code;
    private String msg;
    private int count;
    private List<T> data;
}
