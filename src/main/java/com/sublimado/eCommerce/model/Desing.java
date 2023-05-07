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

    public double calculatePriceByColor(){ return 0.0;}
    public double calculatePriceByType(){return 0.0;}
}
