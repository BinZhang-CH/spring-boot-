package com.ztkj.service.impl;

import com.ztkj.service.UserService;
import com.ztkj.mapper.UserDao;
import com.ztkj.pojo.User;
import com.ztkj.util.Message;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    @Override
    public Message addUser(User user) {
        return null;
    }

    @Override
    public List<User> getUserByPage(User user) {
        return null;
    }
}
