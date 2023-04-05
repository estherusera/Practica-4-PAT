package edu.comillas.icai.patPractica4.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import edu.comillas.icai.patPractica4.service.TableContact;

@RestController
public class TableContactControler {

    @Autowired
    private TableContact tbl;

    @GetMapping("/tableContacts")
    public Object apiTable() {
        return tbl.getData();
    }

    // Puedo hacer el post de contact aqui mismo?

}
