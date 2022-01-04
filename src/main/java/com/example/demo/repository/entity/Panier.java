package com.example.demo.repository.entity;


import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "panier")
public class Panier {
    @Id
    @Column(name = "id_panier")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPanier;

    @Column(name="date_ajout")
    private LocalDate dateAjout;

    @Column(name = "nombre_article")
    private int nombreArticle;

    @Column(name = "prix_article")
    private int prixArticle;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_utilisateur", referencedColumnName = "id_utilisateur")
    private Utilisateur utilisateur;

    @OneToMany(cascade = CascadeType.ALL)
    private List<LignePanier> lignePanierList;

}
