package com.user.Service;



import com.user.Module.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    List<User> queryUserByName(String name);
    List<User> queryAll();
    List<User> queryUserByPage(Integer page, Integer rows);
}
