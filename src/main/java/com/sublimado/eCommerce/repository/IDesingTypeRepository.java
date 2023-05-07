package com.sublimado.eCommerce.repository;

import com.sublimado.eCommerce.model.DesingType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDesingTypeRepository extends JpaRepository<DesingType, Long> {
}
