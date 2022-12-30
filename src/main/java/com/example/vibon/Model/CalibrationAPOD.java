package com.example.vibon.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CalibrationAPOD {
    private double value_ms;

    public CalibrationAPOD(@JsonProperty("value_ms") double value_ms) {
        this.value_ms = value_ms;
    }

    public double getValue_ms() {
        return value_ms;
    }
}
