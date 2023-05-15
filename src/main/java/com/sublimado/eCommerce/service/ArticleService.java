package com.sublimado.eCommerce.service;

import com.sublimado.eCommerce.model.Article;
import com.sublimado.eCommerce.repository.IArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService implements IArticleService{

    @Autowired
    private IArticleRepository articleRepository;

    @Override
    public void saveArticle(Article article) {
        articleRepository.save(article);
    }

    @Override
    public Article getArticle(Long idArticle) throws Exception {
        return articleRepository.findById(idArticle)
                .orElseThrow(() -> new Exception("El id ingresado no ha sido encontrado"));
    }

    @Override
    public List<Article> articles() {
        return articleRepository.findAll();
    }

    @Override
    public void updateArticle(Article article, String name) {
        Article articleBD = articleRepository.findByName(name);
        Long idArticle = articleBD.getIdProduct();
        articleBD = article;
        article.setIdProduct(idArticle);
        articleRepository.save(articleBD);
    }

    @Override
    public void deleteArticle(Long idArticle) {
        articleRepository.deleteById(idArticle);
    }
}
