package com.sublimado.eCommerce.repository;

import com.sublimado.eCommerce.model.Desing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDesingRepository extends JpaRepository<Desing, Long> {
}
