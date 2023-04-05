package edu.comillas.icai.patPractica4.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TableContactImpl implements TableContact {

    private String key = "https://jsonplaceholder.typicode.com/users";

    Logger log = LoggerFactory.getLogger(TableContactImpl.class);

    @Override
    public Object getData() {

        log.info("Llamando a la API");

        RestTemplate restTemplate = new RestTemplate();
        Object obj = restTemplate.getForObject(key, Object.class);

        log.info("Objecto: " + obj.toString());

        return obj;
    }

}
