package com.example.layui.service;

import com.example.layui.dao.UserDao;
import com.example.layui.domain.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Override
    public List<User>  queryAll() {
        return userDao.queryAll();
    }
}
