package com.example.vibon.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TempAPOD {
    private double temp;

    public TempAPOD(@JsonProperty("temperature") double temp) {
        this.temp = temp;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }
}
