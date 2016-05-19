/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jasenrekisteri.entitys;

/**
 *
 * @author Joni
 */
public class Jasen {
    // ATTRIBUUTIT
    private long id;
    private String etunimi;
    private String sukunimi;
    private String email;

    // RAKENTAJAT
    public Jasen(){}
    public Jasen(String etunimi, String sukunimi, String email){
        this.etunimi = etunimi;
        this.sukunimi = sukunimi;
        this.email = email;
    }
    
    // GET&SET
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEtunimi() {
        return etunimi;
    }

    public void setEtunimi(String etunimi) {
        this.etunimi = etunimi;
    }

    public String getSukunimi() {
        return sukunimi;
    }

    public void setSukunimi(String sukunimi) {
        this.sukunimi = sukunimi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
