package com.example.demo.Service;

import com.example.demo.Service.modele.UtilisateurDTO;
import com.example.demo.mapper.UtilisateurMapper;
import com.example.demo.repository.UtilisateurRepository;
import com.example.demo.repository.entity.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UtilisateurService {
    private UtilisateurRepository utilisateurRepository;
    private UtilisateurMapper utilisateurMapper=UtilisateurMapper.getInstance();


    @Autowired
    public UtilisateurService(UtilisateurRepository utilisateurRepository){
        this.utilisateurRepository = utilisateurRepository;

    }

    public UtilisateurDTO getUtilisateur(String email){
        Optional<Utilisateur>utilisateur = utilisateurRepository.findByEmail(email);

        Utilisateur utilisateurEntity = utilisateur.get();


        UtilisateurDTO utilisateurDTO = utilisateurMapper.UtilisateurToUtilisateurDTO(utilisateurEntity);

        return utilisateurDTO;

    }


}
