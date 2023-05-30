package com.sUrl.sUrl;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;


@Controller
public class controller {
 
    @Autowired
    service s;

    @GetMapping("/")
    public String index(){
        return "index.html";
    }

    @PostMapping("/getURL")
    public String getURL(@ModelAttribute url URL,Model model) {
         System.out.println(URL.getUrl());

        model.addAttribute("link", s.generateURL(URL.getUrl()));
        return "getURL.html";
    }

}
