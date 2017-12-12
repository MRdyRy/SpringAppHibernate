/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rudy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author user
 */
@Controller
@RequestMapping("/welcome")
public class Welcome {
    
    @RequestMapping("")
    public String myPage(Model model){
        model.addAttribute("message","now without xml config");
        return "page"; //return nya si view  (page adalah view)
    }
    @RequestMapping("/employees")
    public String pageNya(Model model)
    {
        model.addAttribute("message","Employee");
        return "page";
    }
}
