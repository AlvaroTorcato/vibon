package com.example.vibon.Service;


import com.example.vibon.Model.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
@Service
public class RequestService {

    @Value("${vibon.espip}")
    private String baseURL;

    private HttpURLConnection openConn(String baseUrl) throws IOException {

        URL url = new URL(baseUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestProperty("accept", "application/json");

        return connection;
    }

    public TempDTO retriveTempFromApi(){
        String baseUrl = baseURL+"/temperature/";
        TempDTO tempDTO = null;
        try {
            InputStream responseStream = openConn(baseUrl).getInputStream();

            ObjectMapper mapper = new ObjectMapper();

            TempAPOD tempAPOD = mapper.readValue(responseStream, TempAPOD.class);
            tempDTO = new TempDTO(tempAPOD);
        } catch (IOException e) {
            System.out.println(e);
        }
        return tempDTO;
    }

    public HumDTO retriveHumFromApi() {
        String baseUrl = baseURL+"/humidity/";
        HumDTO humDTO = null;
        try {
            InputStream responseStream = openConn(baseUrl).getInputStream();

            ObjectMapper mapper = new ObjectMapper();

            HumAPOD humAPOD = mapper.readValue(responseStream, HumAPOD.class);
            humDTO = new HumDTO(humAPOD);
        } catch (IOException e) {
            System.out.println(e);
        }
        return humDTO;
    }

    public HeatIndexDTO retriveHeatIndexFromApi() {
        String baseUrl = baseURL+"/heatIndex/";
        HeatIndexDTO heatIndexDTO = null;
        try {
            InputStream responseStream = openConn(baseUrl).getInputStream();

            ObjectMapper mapper = new ObjectMapper();

            HeatIndexAPOD heatIndexAPOD = mapper.readValue(responseStream, HeatIndexAPOD.class);
            heatIndexDTO = new HeatIndexDTO(heatIndexAPOD);
        } catch (IOException e) {
            System.out.println(e);
        }
        return heatIndexDTO;
    }

    public CalibrationDTO retriveCalibrationFromApi(int n, int mm) {
        String baseUrl = baseURL+"/calibration?dist=" + mm +"&n=" + n;
        CalibrationDTO calibrationDTO = null;
        try {
            InputStream responseStream = openConn(baseUrl).getInputStream();

            ObjectMapper mapper = new ObjectMapper();

            CalibrationAPOD calibrationAPOD = mapper.readValue(responseStream, CalibrationAPOD.class);
            calibrationDTO = new CalibrationDTO(calibrationAPOD);
        } catch (IOException e) {
            System.out.println(e);
        }
        return calibrationDTO;
    }
}
