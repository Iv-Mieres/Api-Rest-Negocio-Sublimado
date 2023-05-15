package com.sublimado.eCommerce.service;

import com.sublimado.eCommerce.model.Desing;

import java.util.List;

public interface IDesingService {

    void saveDesing(Desing desing);
    Desing getDesing(Long idDesing) throws Exception;
    List<Desing> desings();
    void updateDesing(Desing desing, Long idDesing) throws Exception;
    void deleteDesing(Long idDesing);
}
