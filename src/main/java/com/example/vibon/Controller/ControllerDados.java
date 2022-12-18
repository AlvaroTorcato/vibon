package com.example.vibon.Controller;

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
}
