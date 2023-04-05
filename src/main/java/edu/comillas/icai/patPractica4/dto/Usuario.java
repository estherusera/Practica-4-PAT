package edu.comillas.icai.patPractica4.dto;

import java.io.Serializable;

public class Usuario implements Serializable {
    private String name;
    private String apellidos;
    private String mail;
    private String msg;

    public Usuario(String name, String apellidos, String mail, String msg) {
        this.name = name;
        this.apellidos = apellidos;
        this.mail = mail;
        this.msg = msg;
    }

    public String getName() {
        return name;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getEmail() {
        return mail;
    }

    public String getMsg() {
        return msg;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEmail(String mail) {
        this.mail = mail;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Contact [name=" + name + ", apellidos=" + apellidos + ", email=" + mail + ", mensaje=" + msg + "]";
    }

}
