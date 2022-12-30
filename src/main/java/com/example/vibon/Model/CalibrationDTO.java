package com.example.vibon.Model;

import lombok.Data;

@Data
public class CalibrationDTO {
    private double value_ms;

    public CalibrationDTO(double value_ms) {
        this.value_ms = value_ms;
    }

    public CalibrationDTO(CalibrationAPOD calibrationAPOD) {
        this.value_ms= calibrationAPOD.getValue_ms();
    }

    public double getValue_ms() {
        return value_ms;
    }
}
