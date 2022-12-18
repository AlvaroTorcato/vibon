package com.example.vibon.Service;

import com.example.vibon.Model.TempDTO;
import com.example.vibon.Model.Temperatura;
import com.example.vibon.Repository.TemperaturaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceDados {
    @Autowired
    TemperaturaRepo repo;
    @Autowired
    private RequestService service;
    public Temperatura getTemperatura() {
        //request to esp32
        TempDTO tempDTO=service.retriveTempFromApi();
        //criaçao do objeto
        Temperatura temperatura= new Temperatura(tempDTO.getTemp());
        //save do objeto
        repo.save(temperatura);
        //return do objeto
        return temperatura;
    }
}
