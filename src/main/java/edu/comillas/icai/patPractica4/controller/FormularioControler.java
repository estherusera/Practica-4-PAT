package edu.comillas.icai.patPractica4.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

import edu.comillas.icai.patPractica4.dto.Usuario;
import edu.comillas.icai.patPractica4.service.RegistroInt;

@RestController
public class FormularioControler {

    private HashMap<String, String> usuarios = new HashMap<>();

    @Autowired
    private RegistroInt reg;

    @GetMapping("/usuarios")
    public ResponseEntity<HashMap<String, String>> getUsuarios() {

        return new ResponseEntity<HashMap<String, String>>(usuarios, HttpStatus.OK);
    }

    @PostMapping(path = "/usuarios", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.TEXT_PLAIN_VALUE)
    public ResponseEntity<String> user(@RequestBody Usuario u) {

        return new ResponseEntity<String>(reg.guardarUsuario(u), HttpStatus.OK);

    }

}
