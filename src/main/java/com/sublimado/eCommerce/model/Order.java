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
    private int numberOfItems;
    @ManyToOne
    @JoinColumn(name = "fkDesing")
    private Desing desing;
    @ManyToOne
    @JoinColumn(name = "fkClient")
    private Client client;
    @ManyToOne
    @JoinColumn(name = "fkArticle")
    private Article article;

    public void validateStock() throws Exception {
        if(this.article.getStock() <= 0) throw new Exception("Stock no disponible");
    }

    public int discountStock() throws Exception {
        if(this.numberOfItems < 0){
            throw new Exception("El numero de items ingresado debe ser máyor a 0");
        }
        int discount = this.article.getStock() - this.numberOfItems;
        if(discount < 0){
            throw new Exception("Stock no disponible");
        }
        return discount;
    }

    public double calculateTotalPrice(){
        double result = this.article.getPrice() + this.desing.getPrice();
        return result;
    }



}
