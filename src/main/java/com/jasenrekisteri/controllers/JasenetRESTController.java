/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jasenrekisteri.controllers;

import com.jasenrekisteri.entitys.Jasen;
import com.jasenrekisteri.repositories.JasenRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Joni
 */
@RestController
public class JasenetRESTController {
  
    @Autowired
    JasenRepository crudRepository;
    
    
    @RequestMapping(value = "REST/jasenet", method = RequestMethod.GET)
    public List listaaJasenet(Model model) {
        
        List jasenet = crudRepository.findAll();
        
        return jasenet;
    }
    
    @RequestMapping(value = "REST/uusiJasen", method = RequestMethod.POST)
    public void lisaaJasen(Jasen jasen){
        
        crudRepository.save(jasen);
        
    }
    
    @RequestMapping(value = "REST/poistaJasen", method = RequestMethod.DELETE)
    public void poistaJasen(@RequestParam(value="id", required = true) long id) {
        
        crudRepository.deleteById(id);

    }
    
    @RequestMapping(value = "REST/muokkaaJasen", method = RequestMethod.PUT)
    public void paivitaJasen(@RequestParam(value = "id", required = true) long id,
            @RequestParam(value = "etunimi") String etunimi,
            @RequestParam(value = "sukunimi") String sukunimi,
            @RequestParam(value = "emal") String email) {
        
        Jasen j = new Jasen(id, etunimi, sukunimi, email);
        crudRepository.save(j);
        
    }
}
