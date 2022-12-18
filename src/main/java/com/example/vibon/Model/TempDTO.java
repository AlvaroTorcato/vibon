package com.example.vibon.Model;

import lombok.Data;
@Data
public class TempDTO {
    private double temp;

    public TempDTO(double temp) {
        this.temp = temp;
    }

    public TempDTO(TempAPOD tempAPOD) {
        this.temp = tempAPOD.getTemp();
    }
    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }
}
