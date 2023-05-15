package com.sublimado.eCommerce.service;

import com.sublimado.eCommerce.model.DesingType;
import com.sublimado.eCommerce.repository.IDesingTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DesingTypeService implements IDesingTypeService{

    @Autowired
    private IDesingTypeRepository desingTypeRepository;

    @Override
    public void saveDesingType(DesingType desingType) {
        desingTypeRepository.save(desingType);
    }

    @Override
    public DesingType getDesingType(Long idDesing) throws Exception {
        return desingTypeRepository.findById(idDesing)
                .orElseThrow(() -> new Exception("El id no ha sido encontrado"));
    }

    @Override
    public List<DesingType> types() {
        return desingTypeRepository.findAll();
    }

    @Override
    public void updateDesingType(DesingType desingType, Long idDesingType) throws Exception {
        DesingType typeBD = this.getDesingType(idDesingType);
        typeBD = desingType;
        typeBD.setIdType(idDesingType);
        desingTypeRepository.save(typeBD);
    }

    @Override
    public void deleteDesingType(Long idDesingType) {
        desingTypeRepository.deleteById(idDesingType);
    }
}
