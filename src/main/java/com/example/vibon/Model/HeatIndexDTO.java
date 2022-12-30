package com.example.vibon.Model;

import lombok.Data;

@Data
public class HeatIndexDTO {
    private double heatIndex;

    public HeatIndexDTO(double heatIndex) {
        this.heatIndex = heatIndex;
    }

    public HeatIndexDTO(HeatIndexAPOD heatIndexAPOD) {
        this.heatIndex = heatIndexAPOD.getHeatIndex();
    }
    public double getHeatIndex() {
        return heatIndex;
    }

    public void setHeatIndex(double heatIndex) {
        this.heatIndex = heatIndex;
    }
}
