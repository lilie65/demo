package com.example.demo.Service;

import com.example.demo.Service.modele.UtilisateurDTO;
import com.example.demo.mapper.UtilisateurMapper;
import com.example.demo.repository.LignePanierRepository;
import com.example.demo.repository.UtilisateurRepository;
import com.example.demo.repository.entity.LignePanier;
import com.example.demo.repository.entity.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UtilisateurService {
    private UtilisateurRepository utilisateurRepository;
    private LignePanierRepository lignePanierRepository;
    private UtilisateurMapper utilisateurMapper=UtilisateurMapper.getInstance();


    @Autowired
    public UtilisateurService(UtilisateurRepository utilisateurRepository, LignePanierRepository lignePanierRepository){
        this.utilisateurRepository = utilisateurRepository;
        this.lignePanierRepository =lignePanierRepository;
    }

    public UtilisateurDTO getUtilisateur(String email){
        Optional<Utilisateur>utilisateur = utilisateurRepository.findByEmail(email);

        Utilisateur utilisateurEntity = utilisateur.get();

        List<LignePanier> lignePanierList = lignePanierRepository.getByPanier(utilisateurEntity.getPanier());

        UtilisateurDTO utilisateurDTO = utilisateurMapper.UtilisateurToUtilisateurDTO(utilisateurEntity,lignePanierList);

        return utilisateurDTO;

    }


}
