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
public class MuokkaaJasenController {
    
    @Autowired
    JasenRepository crudRepository;
    
    @RequestMapping(value = "muokkaaJasen", method = RequestMethod.GET)
    public String naytaMuokattavaJasen(@RequestParam(value="id", required = true) long id, Model model) {
        
        model.addAttribute("jasen", crudRepository.findOne(id));
        return "muokkaaJasen";
        
    }
    
    @RequestMapping(value = "muokkaaJasen", method = RequestMethod.POST)
    public String paivitaJasen(Jasen jasen) {
        
        crudRepository.save(jasen);
        
        String redirectUrl = "jasenet.html";
        return "redirect:" + redirectUrl;
        
    }
}
