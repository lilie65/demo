package com.example.demo.Service.modele;

import com.example.demo.repository.entity.Panier;
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
public class PanierDTO {

    private Long idPanier;

    private LocalDate dateAjout;

    private int nombreArticle;

    private int prixArticle;

    private List<LignePanierDTO> lignePanierDTOList;
}
