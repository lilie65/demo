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
public class LignePanierDTO {

    private Long idLigne;

    private int prixTotal;

    private int reduction;

    private LocalDate dateAjout;

    private List<ArticleDTO> articleDTOS;


}
