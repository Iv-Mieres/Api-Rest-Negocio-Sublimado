package com.sublimado.eCommerce.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "types")
public class DesingType {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idType;
    private String type;
    private Desing desing;
}
