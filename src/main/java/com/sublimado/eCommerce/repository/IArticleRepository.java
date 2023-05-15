package com.sublimado.eCommerce.repository;

import com.sublimado.eCommerce.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IArticleRepository extends JpaRepository<Article, Long> {

    Article findByName(String name);
}
