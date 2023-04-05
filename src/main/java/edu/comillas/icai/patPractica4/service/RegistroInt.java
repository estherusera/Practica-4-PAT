package edu.comillas.icai.patPractica4.service;

import org.springframework.stereotype.Service;

import edu.comillas.icai.patPractica4.dto.Usuario;

@Service
public interface RegistroInt {

    String guardarUsuario(Usuario U); //

}
