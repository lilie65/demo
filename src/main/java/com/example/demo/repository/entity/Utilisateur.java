package com.example.demo.repository.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Setter
@Getter
@Entity
@Table(name ="utilisateur")
public class Utilisateur {
    @Id
    @Column(name = "id_utilisateur")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdUtilisateur;

    private String nom;

    private String Prenom;

    private String adresse;

    @Column(name= "code_postal")
    private int codePostal;

    private String ville;

    private String email;

    @Column( name = "adresse_complementaire")
    private String adresseComplementaire;

    private Byte[] photo;

    @Column(name= "mot_de_passe")
    @JsonIgnore
    private String motDePasse;

    @OneToOne(mappedBy = "utilisateur", cascade = CascadeType.ALL)
    private Panier panier;


    @OneToMany(mappedBy = "utilisateur",cascade = CascadeType.ALL)
    private List<Commande> commandeList;

}
