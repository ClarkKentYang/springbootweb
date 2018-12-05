package com.milan.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {

    @PostMapping("/user/login")
    //@RequestMapping(value = "/user/login",method = RequestMethod.POST)
    public String login(@RequestParam String username,
                        @RequestParam String password,
                        Map<String,Object> map,
                        HttpSession session){
        if(!username.isEmpty()&&password.equals("1")){
            //防止重复提交，故选择重定向
            session.setAttribute("loginUser",username);
            return "redirect:/main.html";
        }else{
            map.put("msg","用户名或密码错误");
            return "login";
        }

    }


}
