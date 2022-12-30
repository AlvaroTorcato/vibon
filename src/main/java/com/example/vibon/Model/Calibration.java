package com.example.vibon.Model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "calibrations")
public class Calibration{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCriacao;

    private double value_mm;
    private double value_ms;


    public Calibration(double value_mm, double value_ms){
        setCreationDateTime();
        this.value_mm = value_mm;
        this.value_ms = value_ms;
    }

    public Calibration() {

    }

    public void setCreationDateTime() {
        this.dataCriacao = getDate();
    }
    private Date getDate(){
        Date dNow = new Date();
        return dNow;
    }



}
