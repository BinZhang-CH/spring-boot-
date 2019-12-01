package com.ztkj.controller;

import com.ztkj.pojo.User;
import com.ztkj.service.UserService;
import com.ztkj.util.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserCtr {
    @Autowired
    private UserService userService;

    /**
     * 页面跳转
     * @param page
     * @return
     */
    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page) {
        return page;
    }


    @RequestMapping("addUser")
    public String addUser(User user) {
        Message message = userService.addUser(user);
        return "ok";
    }

    @RequestMapping("/getUserBypage")
    @ResponseBody
    public List<User> getUserBypage(User user) {
        List<User> userByPage = userService.getUserByPage(user);
        return userByPage;
    }

}
