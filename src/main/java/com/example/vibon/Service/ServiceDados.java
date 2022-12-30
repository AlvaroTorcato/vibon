package com.example.vibon.Service;

import com.example.vibon.Model.*;
import com.example.vibon.Repository.CalibrationRepo;
import com.example.vibon.Repository.HeatIndexRepo;
import com.example.vibon.Repository.HumRepo;
import com.example.vibon.Repository.TemperaturaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceDados {
    @Autowired
    TemperaturaRepo repo;
    @Autowired
    HumRepo repoHum;
    @Autowired
    HeatIndexRepo repoHeatIndex;

    @Autowired
    CalibrationRepo repoCalibration;
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

    public Hum getHum() {
        HumDTO humDTO=service.retriveHumFromApi();
        Hum hum= new Hum(humDTO.getHum());
        repoHum.save(hum);
        return hum;
    }

    public HeatIndex getHeatIndex() {
        HeatIndexDTO heatIndexDTO=service.retriveHeatIndexFromApi();
        HeatIndex heatIndex= new HeatIndex(heatIndexDTO.getHeatIndex());
        repoHeatIndex.save(heatIndex);
        return heatIndex;
    }

    public Calibration getCalibration(int n, int mm) {
        CalibrationDTO calibrationDTO=service.retriveCalibrationFromApi(n,mm);
        Calibration calibration= new Calibration(mm,calibrationDTO.getValue_ms());
        repoCalibration.save(calibration);
        return calibration;
    }
}
