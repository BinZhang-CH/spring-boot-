package com.ztkj.controller;

import com.ztkj.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * springboot整合jsp
 *  注意这里要做视图的跳转 不可用restControler
 */
@Controller
public class UserCtr {

    @RequestMapping("/showUser")
    public String showUser(Model model){
        ArrayList<User> users = new ArrayList<User>();
        User zhangsan = new User(1, "zhangsan", 20);
        User lisi = new User(2, "lisi", 50);
        User wwangwu = new User(3, "wwangwu", 90);
        users.add(zhangsan);
        users.add(lisi);
        users.add(wwangwu);
        model.addAttribute("key","world");
        return "index";
    }
}
