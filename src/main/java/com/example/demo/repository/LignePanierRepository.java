package com.example.demo.repository;

import com.example.demo.repository.entity.LignePanier;
import com.example.demo.repository.entity.Panier;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LignePanierRepository extends JpaRepository<LignePanier,Long> {
List<LignePanier>getByPanier(Panier panier);
}
