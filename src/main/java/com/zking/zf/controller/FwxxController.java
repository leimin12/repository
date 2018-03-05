package com.zking.zf.controller;

import com.zking.zf.biz.IFwlxBiz;
import com.zking.zf.biz.IFwxxBiz;
import com.zking.zf.model.Fwlx;
import com.zking.zf.model.Fwxx;
import com.zking.zf.model.Yh;
import com.zking.zf.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.support.RequestContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("fwxxController")
public class FwxxController {
    @Autowired
    private IFwxxBiz iFwxxBiz;

    @Autowired
    private IFwlxBiz iFwlxBiz;

    @ModelAttribute
    public void init(Model model) {
        List<Fwlx> fwlxList = iFwlxBiz.list(new Fwlx());
        model.addAttribute("command", new Yh());
        model.addAttribute("fwxx", new Fwxx());
        model.addAttribute("fwlxList", fwlxList);
    }

    @RequestMapping("toAddFwxx")
    public String toAddFwxx() {
        return "addFwxx";
    }

    @RequestMapping("add")
    public String add(Fwxx fwxx, HttpSession session,HttpServletRequest request) {
        Yh yh =(Yh) session.getAttribute("Yh");
        fwxx.setYhbh(yh.getYhbh());
        iFwxxBiz.add(fwxx);
        //该用于后台读取资源文件
        RequestContext requestContext = new RequestContext(request);
        String errorMsg = requestContext.getMessage("login.error.label");
        System.out.println("errorMsg:" + errorMsg);
        return "redirect:/fwxxController/myList";
    }

    @RequestMapping("edit")
    public String edit(Fwxx fwxx) {
        iFwxxBiz.edit(fwxx);
        return "redirect:/fwxxController/myList";
    }

    @RequestMapping("del")
    public String del(Fwxx fwxx) {
        iFwxxBiz.del(fwxx);
        return "redirect:/fwxxController/myList";
    }

    @RequestMapping("load")
    public String load(Fwxx fwxx, Model model) {
        Fwxx f = iFwxxBiz.load(fwxx);
        model.addAttribute("f", f);
        return "detailFwxx";
    }

    @RequestMapping("toEditFwxx")
    public String toEditFwxx(Fwxx fwxx, Model model) {
        Fwxx f = iFwxxBiz.load(fwxx);
        model.addAttribute("command", f);
        return "editFwxx";
    }
    public PageBean initPageBean(HttpServletRequest request){
        PageBean pageBean=new PageBean();
        pageBean.setRequest(request);
        request.setAttribute("pageBean",pageBean);
        return pageBean;
    }

    @RequestMapping("list")
    public String list(Fwxx fwxx, Model model,HttpServletRequest request) {

        List<Fwxx> fwxxList = iFwxxBiz.list(fwxx, this.initPageBean(request));
        model.addAttribute("fwxxList", fwxxList);
        return "forward:/yhController/toLogin";
    }
    @RequestMapping("listToJso")
    @ResponseBody
    public List<Fwxx> listToJso(Fwxx fwxx, Model model,HttpServletRequest request) {
        return iFwxxBiz.list(fwxx, this.initPageBean(request));
    }
    @RequestMapping("myList")
    public String myList(Fwxx fwxx, Model model,HttpServletRequest request,HttpSession session) {
        Yh yh =(Yh) session.getAttribute("Yh");
        fwxx.setYhbh(yh.getYhbh());
        List<Fwxx> fwxxList = iFwxxBiz.list(fwxx,this.initPageBean(request));
        model.addAttribute("fwxxList", fwxxList);
        return "listMyFwxx";
    }
}

