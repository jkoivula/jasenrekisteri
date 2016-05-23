/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jasenrekisteri.controllers;

import com.jasenrekisteri.entitys.Jasen;
import com.jasenrekisteri.repositories.JasenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Joni
 */
@Controller
public class UusiJasenController {
     
    @Autowired
    JasenRepository crudRepository;
    
    @RequestMapping(value = "uusiJasen", method = RequestMethod.GET)
    public String uusiJasen(Model model) {
        
        model.addAttribute("jasen", new Jasen());
        
        return "uusiJasen";
        
    }
    
    @RequestMapping(value = "uusiJasen", method = RequestMethod.POST)
    public String lisaaJasen(Jasen jasen){
        
        crudRepository.save(jasen);

        String redirectUrl = "jasenet.html";
        return "redirect:" + redirectUrl;
    }
    
}
