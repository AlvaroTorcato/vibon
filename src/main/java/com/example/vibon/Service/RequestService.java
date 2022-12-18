package com.example.vibon.Service;


import com.example.vibon.Model.TempAPOD;
import com.example.vibon.Model.TempDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
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

}
