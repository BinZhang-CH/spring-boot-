package com.ztkj.service;

import com.ztkj.pojo.User;
import com.ztkj.util.Message;

import java.util.List;

public interface UserService {
    /**
     * 添加用户
     * @param user
     * @return
     */
    public Message addUser(User user);

    List<User> getUserByPage(User user);
}
