package com.springmvc.controller;

import com.springmvc.entity.Userinfo;
import com.springmvc.service.UserinfoService;
import com.springmvc.util.Encryption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by toutou on 2018/5/27.
 */
@Controller
public class userController {
    @Autowired
    private UserinfoService userService;

    @RequestMapping(value="/user/add", method = RequestMethod.GET)
    public String adduser(Model model) {
        Userinfo userinfo=new Userinfo();
        userinfo.setName("张祖盛");
        userinfo.setPass("123456");
        userinfo.setPhone("15051432856");
        userinfo.setCreatetime(new Date());
        userService.insert(userinfo);

        model.addAttribute("data",userinfo);
        return "register";
    }

}