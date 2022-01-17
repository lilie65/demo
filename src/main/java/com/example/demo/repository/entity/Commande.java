package com.example.demo.repository.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "commande")
public class Commande {
    @Id
    @Column(name = "id_commande")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCommande;

    @Column(name="date_achat")
    private LocalDate dateAchat;

    private int prix;
    @Column(name="date_envoie")
    private LocalDate date;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_utilisateur", referencedColumnName = "id_utilisateur")
    private Utilisateur utilisateur;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_commande")
    private List <LigneCommande> ligneCommandesList;

}
