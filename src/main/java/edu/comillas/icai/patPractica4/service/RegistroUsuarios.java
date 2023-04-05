package edu.comillas.icai.patPractica4.service;

import java.util.HashMap;

import org.springframework.stereotype.Service;

import edu.comillas.icai.patPractica4.dto.Usuario;

@Service
public class RegistroUsuarios implements RegistroInt {

    private HashMap<String, String> usuarios = new HashMap<>();

    public String guardarUsuario(Usuario u) {
        if (usuarios.containsKey(u)) {
            return "Error en guardar usuario";
        } else {
            usuarios.put(u.getName(), u.getApellidos());

            return "Usuario guardado correctamente";
        }

    }
}
