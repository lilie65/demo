package com.example.demo.mapper;

import com.example.demo.Service.modele.*;
import com.example.demo.repository.entity.*;

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

    public UtilisateurDTO UtilisateurToUtilisateurDTO(Utilisateur utilisateur) {

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
        utilisateurDTO.setCommandeListDTO(commandeDTOList(utilisateur.getCommandeList()));

       // utilisateurDTO.setArticleDTOS(articleToArticleListDTO(articleList));

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
        panierDTO.setLignePanierDTOList(lignePanierDTOS(panier.getLignePanierList()));
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
        lignePanierDTO.setArticleDTOS(articleToArticleListDTO(lignePanier.getArticleList()));

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


    //------------------------------------------------------------------------
    // Commande
    //------------------------------------------------------------------------
    public CommandeDTO commandeToCommandeDTO (Commande commande){
        if(commande == null){
            return null;
        }
        CommandeDTO commandeDTO = new CommandeDTO();
        commandeDTO.setIdCommande(commande.getIdCommande());
        commandeDTO.setDate(commande.getDate());
        commandeDTO.setDateAchat(commande.getDateAchat());
        commandeDTO.setPrix(commande.getPrix());
        commandeDTO.setLigneCommandesDTO(ligneCommandeToCommandeDTOList(commande.getLigneCommandesList()));
        return commandeDTO;
    }
    //------------------------------------------------------------------------
    //Liste Commande
    //------------------------------------------------------------------------
    List<CommandeDTO> commandeDTOList(List<Commande>commandeList){
        if(commandeList == null){
            return null;
        }
        List<CommandeDTO> dtoList = new ArrayList<>();
        for (Commande commande : commandeList) {
            CommandeDTO commandeDTO = commandeToCommandeDTO(commande);
            dtoList.add(commandeDTO);

        }
        return dtoList;
    }

    //------------------------------------------------------------------------
    //Liste Ligne Commande
    //------------------------------------------------------------------------
    public LigneCommandeDTO ligneCommandeTOLigneCommandeDTO (LigneCommande ligneCommande){
        if(ligneCommande == null){
            return null;
        }
        LigneCommandeDTO ligneCommandeDTO = new LigneCommandeDTO();
        ligneCommandeDTO.setIdLigneCommande(ligneCommande.getIdLigneCommande());
        ligneCommandeDTO.setNombreArticleCommander(ligneCommande.getNombreArticleCommander());
        ligneCommandeDTO.setPrixTotal(ligneCommande.getPrixTotal());
        ligneCommandeDTO.setArticleDTO(articleToArticleDTO(ligneCommande.getArticle()));

        return ligneCommandeDTO;
    }

    List<LigneCommandeDTO> ligneCommandeToCommandeDTOList (List<LigneCommande> ligneListCommande){
        if(ligneListCommande == null){
            return null;
        }
        List<LigneCommandeDTO> dtoList = new ArrayList<>();
        for(LigneCommande ligneCommande : ligneListCommande){
            LigneCommandeDTO ligneCommandeDTO = ligneCommandeTOLigneCommandeDTO(ligneCommande);
            dtoList.add(ligneCommandeDTO);

        }

        return dtoList;
    }

    public ArticleDTO articleToArticleDTO(Article article){
        if(article == null){
            return null;
        }
        ArticleDTO articleDTO= new ArticleDTO();
        articleDTO.setIdArticle(article.getIdArticle());
        articleDTO.setNomArticle(article.getNomArticle());
        articleDTO.setPhotoArticle(article.getPhotoArticle());
        articleDTO.setNombreArticle(article.getNombreArticle());
        articleDTO.setPrixArticle(article.getPrixArticle());
        return articleDTO;
    }
    List<ArticleDTO> articleToArticleListDTO (List<Article> articleList){
        if(articleList == null){
            return null;
        }
        List<ArticleDTO> articleDTOS = new ArrayList<>();
        for(Article article : articleList){
            ArticleDTO articleDTO = articleToArticleDTO(article);
            articleDTOS.add(articleDTO);
        }
        return articleDTOS;
    }

}


