package com.zking.zf.controller;

import com.zking.zf.model.Yh;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("a")
public class HelloController {

    @RequestMapping("hello")
    public String hello(Yh yh, String uname, Model model) {
        System.out.println("hello springMVC");
        System.out.println(yh);
        System.out.println(uname);
        model.addAttribute("za","在");
        return "admin/a";
    }

    @RequestMapping("add")
    public ModelAndView add(ModelAndView modelAndView){
        System.out.println("aaaaaaaaaaaa");
        modelAndView.addObject("a","是");
        modelAndView.setViewName("admin/a");
        return modelAndView;
    }

}
