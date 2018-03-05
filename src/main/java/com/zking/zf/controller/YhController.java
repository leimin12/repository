package com.zking.zf.controller;

import com.zking.zf.biz.IYhBiz;
import com.zking.zf.model.Yh;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@Controller
@RequestMapping("yhController")
public class YhController {

    @Autowired
    private IYhBiz iYhBiz;

    @ModelAttribute
    public void init(Model model) {
        System.out.println("init...");
        model.addAttribute("yh", new Yh());
    }

    @RequestMapping("toLogin")
    public String toLogin() {
        return "index";
    }
    @RequestMapping("toReg")
    public String toReg() {
        return "reg";
    }
    @RequestMapping("add")
    public String add(@Validated({Yh.ValidateGroups.Group.class,Yh.ValidateGroups.reg.class}) Yh yh, BindingResult bindingResult) {
        iYhBiz.add(yh);
//        bindingResult.rejectValue("yhzh", null, "帐号错误");
        if (bindingResult.hasErrors()) {
            return "reg";
        }
        return "toLogin";
    }

    @RequestMapping("doLogin")
    public String doLogin(@Validated Yh yh, BindingResult bindingResult, HttpSession session) {
        Yh y = iYhBiz.doLogin(yh);
        if (y==null){
            bindingResult.rejectValue("yhzh", null, "帐号错误");
        }else{
            if (!(y.getYhmm().equals(yh.getYhmm()))) {
                bindingResult.rejectValue("yhmm", null, "密码错误");
            }
        }
        if (bindingResult.hasErrors()) {
            return "forward:/fwxxController/list";
        }else{
            session.setAttribute("Yh", y);
            return "forward:/fwxxController/list";
        }
    }

    @RequestMapping("login")
    public String login(@Validated({Yh.ValidateGroups.Group.class,Yh.ValidateGroups.login.class}) Yh yh, BindingResult bindingResult, HttpSession session, Model model) {
        Yh y = iYhBiz.doLogin(yh);
        if (y==null){
            bindingResult.rejectValue("yhzh", null, "帐号错误");
        }else{
            if (!y.getYhmm().equals(yh.getYhmm())) {
                bindingResult.rejectValue("yhmm", null, "密码错误");
            }
        }
        if (bindingResult.hasErrors()) {
            return "login";
        }else{
            session.setAttribute("Yh", y);
            return "login";
        }
    }
}
