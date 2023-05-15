package com.sublimado.eCommerce.service;

import com.sublimado.eCommerce.model.DesingType;

import java.util.List;

public interface IDesingTypeService {

    void saveDesingType(DesingType desingType);
    DesingType getDesingType(Long idDesing) throws Exception;
    List<DesingType> types();
    void updateDesingType(DesingType desingType, Long idDesingType) throws Exception;
    void deleteDesingType(Long idDesingType);
}
