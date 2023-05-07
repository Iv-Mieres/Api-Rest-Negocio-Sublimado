package com.sublimado.eCommerce.repository;

import com.sublimado.eCommerce.model.Province;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProvinceRepository extends JpaRepository<Province, Long> {
}
