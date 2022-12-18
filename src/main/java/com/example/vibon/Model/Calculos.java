package com.example.vibon.Model;

public class Calculos {

    public double calcularAlpha(double temp, double[] time_ms, double[] dist_mm){
        double alpha = 0;
        double tempK= (float) (temp + 273.15);
        LinearRegression linearRegression=new LinearRegression(time_ms, dist_mm);
        return alpha=linearRegression.slope();
    }

    public double calcularBeta(double temp, double[] time_ms, double[] dist_mm){
        double alpha = 0;
        double tempK= (float) (temp + 273.15);
        LinearRegression linearRegression=new LinearRegression(time_ms, dist_mm);
        return alpha=linearRegression.intercept();
    }
}
