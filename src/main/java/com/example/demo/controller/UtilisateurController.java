package com.example.demo.controller;

import com.example.demo.Service.UtilisateurService;
import com.example.demo.Service.modele.UtilisateurDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UtilisateurController {
    private UtilisateurService service;

    @Autowired
    public UtilisateurController(UtilisateurService service){ this.service = service;}

    @GetMapping(path = "/utilisateurs/{email}", produces = "application/json")
    public ResponseEntity<UtilisateurDTO> get(@PathVariable String email){
        return ResponseEntity.ok(service.getUtilisateur(email));
    }
}
