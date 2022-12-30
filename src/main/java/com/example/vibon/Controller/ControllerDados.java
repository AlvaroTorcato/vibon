package com.example.vibon.Controller;

import com.example.vibon.Model.Calibration;
import com.example.vibon.Model.HeatIndex;
import com.example.vibon.Model.Hum;
import com.example.vibon.Model.Temperatura;
import com.example.vibon.Service.ServiceDados;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@Tag(name = "Dados", description = "Fornece dados para a organização dos dados ")
@RequestMapping("/dados")
public class ControllerDados {
    @Autowired
    ServiceDados serviceDados;

    @Operation(summary = "Saber a temperatura")
    @GetMapping(value = "/temp")
    public Temperatura getTemperatura(){
        return serviceDados.getTemperatura();
    }
    @Operation(summary = "Saber a humidade")
    @GetMapping(value = "/hum")
    public Hum getHum(){
        return serviceDados.getHum();
    }
    @Operation(summary = "Saber a heat index")
    @GetMapping(value = "/temp")
    public HeatIndex getHeatIndex(){
        return serviceDados.getHeatIndex();
    }
    @Operation(summary = "Calibration")
    @GetMapping(value = "/calibration")
    public Calibration getCalibration(@RequestParam int n, @RequestParam int mm){
        return serviceDados.getCalibration(n,mm);
    }
}
