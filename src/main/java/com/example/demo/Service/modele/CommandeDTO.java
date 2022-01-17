package com.example.demo.Service.modele;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CommandeDTO {

    private Long idCommande;

    private LocalDate dateAchat;

    private int prix;

    private LocalDate date;

    private List<LigneCommandeDTO> ligneCommandesDTO;
}
