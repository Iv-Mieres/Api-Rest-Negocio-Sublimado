package com.sublimado.eCommerce.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idOrder;
    private double totalPrice;
    private LocalDate date;
    @ManyToOne
    @JoinColumn(name = "fkDesing")
    private Desing desing;
    @ManyToOne
    @JoinColumn(name = "fkClient")
    private Client client;
    @ManyToOne
    @JoinColumn(name = "fkArticle")
    private Article article;

    public boolean validateStock(){ return false;}
    public int discountStock(){return 0;}
    public double calculateTotalPrice(){return 0.0;}
}
