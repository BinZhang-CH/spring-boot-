package com.ztkj.controller;

import com.ztkj.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * springboot整合jsp
 *  注意这里要做视图的跳转 不可用restControler
 */
@Controller
public class UserList {

    @RequestMapping("/userList")
    public String showUser(Model model){
        ArrayList<User> users = new ArrayList<User>();
        User zhangsan = new User(1, "zhangsan", 20);
        User lisi = new User(2, "lisi", 50);
        User wangwu = new User(3, "wangwu", 90);
        users.add(zhangsan);
        users.add(lisi);
        users.add(wangwu);
        model.addAttribute("users",users);
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        hashMap.put("A",zhangsan);
        hashMap.put("B",lisi);
        hashMap.put("C",wangwu);
        model.addAttribute("hashMap",hashMap);
        return "userList";
    }
}
