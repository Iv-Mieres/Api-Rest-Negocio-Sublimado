package com.sublimado.eCommerce.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "provinces")
public class Province {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idProvince;
    private String name;
    @OneToMany(mappedBy = "province")
    private List<Client> clients;
}
