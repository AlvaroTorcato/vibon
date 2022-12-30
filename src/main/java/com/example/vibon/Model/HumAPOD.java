package com.example.vibon.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HumAPOD {
    private double hum;

    public HumAPOD(@JsonProperty("humidity") double temp) {
        this.hum = hum;
    }

    public double getHum() {
        return hum;
    }

    public void setHum(double hum) {
        this.hum = hum;
    }
}
