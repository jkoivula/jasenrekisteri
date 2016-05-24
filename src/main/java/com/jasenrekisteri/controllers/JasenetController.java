/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jasenrekisteri.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.jasenrekisteri.repositories.JasenRepository;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Joni
 */
@Controller
public class JasenetController {

    @Autowired
    JasenRepository crudRepository;
    
    @RequestMapping(value = "jasenet", method = RequestMethod.GET)
    public String listaaJasenet(Model model) {
        
        model.addAttribute("jasenet", crudRepository.findAll());
        
        return "jasenet";
    }
    
    
    @RequestMapping(value = "poista", method = RequestMethod.GET)
    public String poistaJasen(@RequestParam(value="id", required = true) long id, Model model) {
        
        crudRepository.deleteById(id);

        String redirectUrl = "jasenet.html";
        return "redirect:" + redirectUrl;
    }
  
}
