package com.example.demo.Service.modele;

import com.example.demo.repository.entity.LignePanier;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class UtilisateurDTO {


        private Long IdUtilisateur;

        private String nom;

        private String Prenom;

        private String adresse;

        private int codePostal;

        private String ville;

        private String email;

        private String adresseComplementaire;

        private Byte[] photo;

        private PanierDTO panierDTO;

        private  List<LignePanierDTO>lignePanierDTOList;
}
