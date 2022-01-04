package com.example.demo.mapper;

import com.example.demo.Service.modele.LignePanierDTO;
import com.example.demo.Service.modele.PanierDTO;
import com.example.demo.Service.modele.UtilisateurDTO;
import com.example.demo.repository.entity.LignePanier;
import com.example.demo.repository.entity.Panier;
import com.example.demo.repository.entity.Utilisateur;

import java.util.ArrayList;
import java.util.List;


public class UtilisateurMapper {
    private static UtilisateurMapper utilisateurMapper;

    public static UtilisateurMapper getInstance() {
        if (utilisateurMapper == null) {
            utilisateurMapper = new UtilisateurMapper();
        }
        return utilisateurMapper;

    }

    private UtilisateurMapper() {

    }

    public UtilisateurDTO UtilisateurToUtilisateurDTO(Utilisateur utilisateur, List<LignePanier> lignePaniersListe) {

        if (utilisateur == null) {
            return null;
        }
        UtilisateurDTO utilisateurDTO = new UtilisateurDTO();
        utilisateurDTO.setIdUtilisateur(utilisateur.getIdUtilisateur());
        utilisateurDTO.setNom(utilisateur.getNom());
        utilisateurDTO.setPrenom(utilisateur.getPrenom());
        utilisateurDTO.setAdresse(utilisateur.getAdresse());
        utilisateurDTO.setCodePostal(utilisateur.getCodePostal());
        utilisateurDTO.setVille(utilisateur.getVille());
        utilisateurDTO.setAdresseComplementaire(utilisateur.getAdresseComplementaire());
        utilisateurDTO.setPhoto(utilisateur.getPhoto());
        utilisateurDTO.setEmail(utilisateur.getEmail());
        utilisateurDTO.setPanierDTO(panierToPanierDTO(utilisateur.getPanier()));
        utilisateurDTO.setLignePanierDTOList(lignePanierDTOS(lignePaniersListe));

        return utilisateurDTO;
    }

    //------------------------------------------------------------------------
    //PANIER
    public PanierDTO panierToPanierDTO(Panier panier) {
        if (panier == null) {
            return null;
        }
        PanierDTO panierDTO = new PanierDTO();
        panierDTO.setIdPanier(panier.getIdPanier());
        panierDTO.setDateAjout(panier.getDateAjout());
        panierDTO.setNombreArticle(panier.getNombreArticle());
        panierDTO.setPrixArticle(panier.getPrixArticle());
        return panierDTO;
    }

    //------------------------------------------------------------------------
    //Ligne panier
    //------------------------------------------------------------------------
    public LignePanierDTO lignePanierTOLignePanierDTO(LignePanier lignePanier) {
        if (lignePanier == null) {
            return null;
        }
        LignePanierDTO lignePanierDTO = new LignePanierDTO();
        lignePanierDTO.setIdLigne(lignePanier.getIdLigne());
        lignePanierDTO.setPrixTotal(lignePanier.getPrixTotal());
        lignePanierDTO.setDateAjout(lignePanier.getDateAjout());
        lignePanierDTO.setReduction(lignePanier.getReduction());

        return lignePanierDTO;
    }

    //------------------------------------------------------------------------
    //Liste Ligne Panier
    //------------------------------------------------------------------------
    List<LignePanierDTO> lignePanierDTOS(List<LignePanier> lignePanierList) {
        if (lignePanierList == null) {
            return null;
        }
        List<LignePanierDTO> list = new ArrayList<>();
        for (LignePanier lignePanier : lignePanierList) {
            LignePanierDTO lignePanierDTO = lignePanierTOLignePanierDTO(lignePanier);
            list.add(lignePanierDTO);
        }
        return list;
    }


    List<PanierDTO> panierDTOListToPanierDTO(List<Panier> panierList) {
        if (panierList == null) {
            return null;
        }
        List<PanierDTO> list = new ArrayList<>();
        for (Panier panier : panierList) {
            PanierDTO panierDTO = panierToPanierDTO(panier);
            list.add(panierDTO);

        }
        return list;
    }


}


