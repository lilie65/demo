package com.example.demo.repository.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "ligne_panier")
public class LignePanier {
    @Id
    @Column(name = "id_ligne")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLigne;

    @Column(name = "prix_total")
    private int prixTotal;

    private int reduction;

    @Column(name = "date_ajout")
    private LocalDate dateAjout;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_panier", referencedColumnName = "id_panier")
    private Panier panier;
}
