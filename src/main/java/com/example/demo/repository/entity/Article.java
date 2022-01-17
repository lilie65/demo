package com.example.demo.repository.entity;


import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "articles")
public class Article {
    @Id
    @Column(name = "id_article")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idArticle;

    @Column(name = "nom_article")
    private String nomArticle;

    @Column(name = "prix_article")
    private int prixArticle;

    @Column(name = "photos_article")
    private Byte[] photoArticle;

    @Column(name = "nombre_article")
    private int nombreArticle;

    @OneToOne( cascade = CascadeType.ALL)
    @JoinColumn(name = "id_ligne", referencedColumnName = "id_ligne")
    private LignePanier lignePanier;

   @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_article",referencedColumnName = "id_article")
    private LigneCommande ligneCommande;

}
