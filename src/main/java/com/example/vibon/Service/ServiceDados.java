package com.example.vibon.Service;

import com.example.vibon.Model.Temperatura;
import com.example.vibon.Repository.TemperaturaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceDados {
    @Autowired
    TemperaturaRepo repo;
    public Temperatura getTemperatura() {
        //request to esp32
        //criaçao do objeto
        //save do objeto
        //return do objeto

        return null;


    }
}
