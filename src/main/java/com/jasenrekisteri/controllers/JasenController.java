/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jasenrekisteri.controllers;

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
public class JasenController {
    
    @Autowired
    JasenRepository crudRepository;
    
    @RequestMapping(value = "jasen", method = RequestMethod.POST)
    public String poistaJasen(@RequestParam(value="valinta", required = true) String valinta,
            @RequestParam(value="nimi", required = true) String nimi, Model model) {

        switch (valinta) {
            case "etunimi": model.addAttribute("jasenet", crudRepository.findByEtunimi(nimi));
                            break;
            case "sukunimi": model.addAttribute("jasenet", crudRepository.findBySukunimi(nimi));
                            break;
            default:        break;
        }

        return "jasen";
    }
}
