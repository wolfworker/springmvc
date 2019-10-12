package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class cityController {

    @RequestMapping("city/detail")
    public String gotest(){
        return "detail";
    }

    @RequestMapping("city/search/data={uname}")
    public String gosearch(@PathVariable("uname")String data, Model model){
        model.addAttribute("data",data);
        return "search";
    }
}
