package com.sublimado.eCommerce.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@Getter
@Setter
@MappedSuperclass
public abstract class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idProduct;
    private double price;
    private String image;
}
