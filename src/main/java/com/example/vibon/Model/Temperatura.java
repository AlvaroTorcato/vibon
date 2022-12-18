package com.example.vibon.Model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "temperaturas")
public class Temperatura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCriacao;

    private double temp;


    public Temperatura(double temp){
        setCreationDateTime();
        this.temp = temp;
    }

    public Temperatura() {

    }

    public void setCreationDateTime() {
        this.dataCriacao = getDate();
    }
    private Date getDate(){
        Date dNow = new Date();
        return dNow;
    }



}
