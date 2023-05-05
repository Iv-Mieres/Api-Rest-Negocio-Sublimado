package com.sublimado.eCommerce.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "desings")
public class Desing extends Product{

    private boolean desingColor;

    public double calculatePriceByColor(){ return 0.0;}
    public double calculatePriceByType(){return 0.0;}
}
