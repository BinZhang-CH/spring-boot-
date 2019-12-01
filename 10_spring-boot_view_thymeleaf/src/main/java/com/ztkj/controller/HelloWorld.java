package com.ztkj.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.misc.Contended;
import java.util.HashMap;
import java.util.Map;

@Controller
public class HelloWorld {

    @RequestMapping("/hello")
    @ResponseBody
    public Map<String, Object> showHelloWrold() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("msg", "Hello World!");
        return map;
    }
}
