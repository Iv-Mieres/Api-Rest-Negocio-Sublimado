package com.sublimado.eCommerce.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "clients")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idClient;
    private String name;
    private String surname;
    private String email;
    private String address;
    private String zipCode;
    private String dni;
    @OneToMany(mappedBy = "client")
    private List<Order> orders;
    @ManyToOne
    @JoinColumn(name = "fkProvince")
    private Province province;


}

