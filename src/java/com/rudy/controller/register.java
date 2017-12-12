/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rudy.controller;

import com.rudy.model.RegisterFormBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author user
 */

@Controller
@RequestMapping("/register")
public class register {
    
    @RequestMapping()
    public String registerForm(Model model)
    {
        RegisterFormBean regBean = new RegisterFormBean(); //create object registerFormBean yang akan menampung register
        //regBean.setFirstname("Udin");
        model.addAttribute("registerBean",regBean); //membuat key dan value untuk dilempar ke view
        return "register"; // semua proses pada blok ini dilempar ke view yaitu register.jsp
    }
    
    @RequestMapping(value="save") //jika value yang register = save
    public String saveRegistration(@ModelAttribute("registerBean") RegisterFormBean registerBean, Model model) //parameternya adalah pojo si penampung & model
    {
        System.out.println("User First Name : "+registerBean.getFirstname());
        model.addAttribute("data", registerBean); //membuat key dan value untuk di lempar ke view successregistration
        return "successregistration"; // semua proses pada blok ini akan dilempar ke view yaitu successregistration.jsp
    }
    
    
}
