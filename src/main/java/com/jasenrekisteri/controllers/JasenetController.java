/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jasenrekisteri.controllers;

import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Joni
 */
@Controller
public class JasenetController {
    
     //ArrayList<Person> personsList = new ArrayList<Person>();
    
    @RequestMapping("/jasenet")
    String jasenet(){
        return "jasenet";
    }
    
    /*
    @RequestMapping(value = "persons", method = RequestMethod.GET)
    public ModelAndView personsListattu(@RequestParam("name") String name,
            @RequestParam("age") int age) {
        Person person = new Person();
        person.setName(name);
        person.setAge(age);
        
        //person.lisaaPerson(person);
        
        ModelAndView mav = new ModelAndView("persons");
        mav.addObject("person", person);
        
        return mav;
        //return "persons/list";
    }
    
    @RequestMapping(value = "persons", method = RequestMethod.POST)
    public ModelAndView newPerson(@RequestParam("name") String name,
            @RequestParam("age") int age) {
        Person person = new Person();
        person.setName(name);
        person.setAge(age);
        
        personsList.add(person);
        
        ModelAndView mav = new ModelAndView("persons");
        mav.addObject("persons", personsList);
        
        return mav;
        //return "persons/list";
    }
    */
}
