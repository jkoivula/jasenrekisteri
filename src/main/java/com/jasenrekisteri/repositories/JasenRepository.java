/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jasenrekisteri.repositories;

import com.jasenrekisteri.entitys.Jasen;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.List;

/**
 *
 * @author Joni
 */
public interface JasenRepository extends CrudRepository<Jasen, Long> {

    List<Jasen> findByEtunimi(String etunimi);
    
    List<Jasen> findBySukunimi(String sukunimi);
    
    Jasen findOne(Long id);
    
    List findAll();
    
    Jasen save(Jasen j);

    @Transactional
    void deleteById(long id);
    
}
