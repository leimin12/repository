package com.zking.zf.controller;

import com.zking.zf.biz.IFwlxBiz;
import com.zking.zf.model.Fwlx;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("fwlxController")
public class FwlxController {

    @Autowired
    private IFwlxBiz iFwlxBiz;

    @RequestMapping("list")
    public String list(Fwlx fwlx, Model model) {
        List<Fwlx> list = iFwlxBiz.list(fwlx);
        model.addAttribute("fwlx", list);
        return null;
    }
}
