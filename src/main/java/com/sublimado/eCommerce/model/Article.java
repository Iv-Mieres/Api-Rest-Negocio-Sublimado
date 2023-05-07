package com.sublimado.eCommerce.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name = "articles")
public class Article extends Product{

    private String name;
    private int stock;
    @OneToMany(mappedBy = "article")
    private List<Order> orders;
}
