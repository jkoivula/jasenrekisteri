/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jasenrekisteri.controllers;

import com.jasenrekisteri.entitys.Jasen;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Joni
 */
@Controller
public class JasenetRESTViewController {
    
    
       @RequestMapping(value = "RESTjasenet", method = RequestMethod.GET)
        public String listaaJasenetThymeleaf(Model model) {
        
        String requestUrl = "https://young-cove-74808.herokuapp.com/REST/jasenet";
        
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Jasen[]> responseEntity = restTemplate.getForEntity(requestUrl, Jasen[].class);
        Jasen[] jasenet = responseEntity.getBody();
        
        model.addAttribute("jasenet", jasenet);
        
        return "RESTjasenet";
    }
    
}
