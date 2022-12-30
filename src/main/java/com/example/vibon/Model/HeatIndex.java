package com.example.vibon.Model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "heatindexs")
public class HeatIndex {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCriacao;

    private double temp;


    public HeatIndex(double temp){
        setCreationDateTime();
        this.temp = temp;
    }

    public HeatIndex() {

    }

    public void setCreationDateTime() {
        this.dataCriacao = getDate();
    }
    private Date getDate(){
        Date dNow = new Date();
        return dNow;
    }



}
