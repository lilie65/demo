package com.example.demo.Service.modele;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ArticleDTO {

    private Long idArticle;

    private String nomArticle;

    private int prixArticle;

    private Byte[] photoArticle;

    private int nombreArticle;


}
