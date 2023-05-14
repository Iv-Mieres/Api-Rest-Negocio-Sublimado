package com.sublimado.eCommerce.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "desings")
public class Desing extends Product{

    private boolean desingColor;
    @ManyToOne
    @JoinColumn(name ="fkType")
    private DesingType desingType;
    @OneToMany(mappedBy = "desing")
    private List<Order> orders;

    public double calculatePriceByColor(double percentage) throws Exception {
        double priceByColor = 0.0;
        if(percentage <= 0.0){
            throw new Exception("El valor ingresado debe ser mayor a 0.0");
        }
        else if(this.desingColor == true) {
            priceByColor = this.getPrice() * (percentage / 10);
        }
        return priceByColor;
    }

    public double calculateTotalPrice(double percentage) throws Exception {
        double sum = (this.calculatePriceByColor(percentage) + this.desingType.getPrice());
        double totalPrice = this.getPrice() + sum;
        return totalPrice;
    }
}
