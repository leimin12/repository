package com.zking.zf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

@Controller
public class UploadController {

    String path="f:\\temp\\uploads\\";
    @RequestMapping("upload")
    public String upload(MultipartFile[] mf) throws Exception{
        for (MultipartFile m:mf) {
            String fileName = m.getOriginalFilename();
            File targetFile = new File(path+fileName);
            m.transferTo(targetFile);
        }
        return "redirect:input/admin/upload";
    }
}
