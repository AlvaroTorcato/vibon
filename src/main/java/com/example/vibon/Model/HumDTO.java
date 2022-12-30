package com.example.vibon.Model;

import lombok.Data;

@Data
public class HumDTO {
    private double hum;

    public HumDTO(double hum) {
        this.hum = hum;
    }

    public HumDTO(HumAPOD humAPOD) {
        this.hum = humAPOD.getHum();
    }
    public double getHum() {
        return hum;
    }

    public void setHum(double hum) {
        this.hum = hum;
    }
}
