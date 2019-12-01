package com.ztkj.controller;

import com.ztkj.pojo.User;
import com.ztkj.service.UserService;
import com.ztkj.util.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.jws.WebParam;
import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserCtr {
    /**
     * 页面跳转
     *
     * @param user
     * @return
     */
    @RequestMapping("/add")
    public String showPage(@ModelAttribute User user) {
        return "add";
    }


    /**
     * 用户添加
     *
     * @param user
     * @param result 封装了校验的结果
     * @return
     * @Valid 开启对User对象的数据校验
     */
    @RequestMapping("/sava")
    public String addUser(@Valid User user, BindingResult result) {
        if (result.hasErrors()) {
            //不合法
            return "add";
        }
        System.out.println(user.toString());
        return "ok";
    }


}
