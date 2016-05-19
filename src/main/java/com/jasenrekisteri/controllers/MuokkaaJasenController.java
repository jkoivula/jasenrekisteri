/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jasenrekisteri.controllers;

import com.jasenrekisteri.entitys.Jasen;
import java.util.ArrayList;
import javax.annotation.PostConstruct;
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
    
    ArrayList<Jasen> jasenetList = new ArrayList<Jasen>();
    
    @PostConstruct
    public void init(){ 
        jasenetList.add(new Jasen(1, "Galle", "Tuohola","a@a.jsnrk"));
        jasenetList.add(new Jasen(2, "Maja", "Koli","b@b.jsnrk"));
    }
    
    @RequestMapping(value = "muokkaaJasen", method = RequestMethod.GET)
    public String naytaMuokattavaJasen(@RequestParam(value="id", required = true) long id, Model model) {
        
        //jasenetList.remove(id);
        id--;
        model.addAttribute("jasen", jasenetList.get((int)id));
        model.addAttribute("uusiJasen", new Jasen());
        
        return "muokkaaJasen";
        
    }
    
}
