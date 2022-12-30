package com.example.vibon.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HeatIndexAPOD {
    private double heatIndex;

    public HeatIndexAPOD(@JsonProperty("heatIndex") double heatIndex) {
        this.heatIndex = heatIndex;
    }

    public double getHeatIndex() {
        return heatIndex;
    }

    public void setHeatIndex(double heatIndex) {
        this.heatIndex = heatIndex;
    }
}
