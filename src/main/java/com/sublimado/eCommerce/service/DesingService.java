package com.sublimado.eCommerce.service;

import com.sublimado.eCommerce.model.Desing;
import com.sublimado.eCommerce.repository.IDesingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DesingService implements IDesingService{

    @Autowired
    private IDesingRepository desingRepository;

    @Override
    public void saveDesing(Desing desing) {
        desingRepository.save(desing);
    }

    @Override
    public Desing getDesing(Long idDesing) throws Exception {
        return desingRepository.findById(idDesing)
                .orElseThrow(() -> new Exception("El id no ha sido encontrado"));
    }

    @Override
    public List<Desing> desings() {
        return desingRepository.findAll();
    }

    @Override
    public void updateDesing(Desing desing, Long idDesing) throws Exception {
        Desing desingBD = this.getDesing(idDesing);
        desingBD = desing;
        desing.setIdProduct(idDesing);
        desingRepository.save(desingBD);
    }

    @Override
    public void deleteDesing(Long idDesing) {
        desingRepository.deleteById(idDesing);
    }
}
