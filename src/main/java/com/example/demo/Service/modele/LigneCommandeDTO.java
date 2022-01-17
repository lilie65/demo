package com.example.demo.Service.modele;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LigneCommandeDTO {

    private Long idLigneCommande;


    private int nombreArticleCommander;


    private int prixTotal;

    private ArticleDTO articleDTO;
}
