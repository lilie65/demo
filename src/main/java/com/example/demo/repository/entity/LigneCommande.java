package com.example.demo.repository.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "ligne_commande")
public class LigneCommande {
    @Id
    @Column(name = "id_article_commander")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLigneCommande;

    @Column(name = "nombre_article_commander")
    private int nombreArticleCommander;

    @Column(name = "prix_total")
    private int prixTotal;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_commande")
    private Commande commande;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_article",referencedColumnName = "id_article")
    private Article article;



}
