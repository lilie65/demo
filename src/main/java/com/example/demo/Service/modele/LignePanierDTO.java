package com.example.demo.Service.modele;

import com.example.demo.repository.entity.Panier;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.time.LocalDate;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LignePanierDTO {
    private Long idLigne;

    private int prixTotal;

    private int reduction;

    private LocalDate dateAjout;

}
