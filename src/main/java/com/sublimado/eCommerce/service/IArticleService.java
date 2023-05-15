package com.sublimado.eCommerce.service;

import com.sublimado.eCommerce.model.Article;

import java.util.List;

public interface IArticleService {

    void saveArticle(Article article);
    Article getArticle(Long idArticle) throws Exception;
    List<Article> articles();
    void updateArticle(Article article, String name);
    void deleteArticle(Long idArticle);
}
