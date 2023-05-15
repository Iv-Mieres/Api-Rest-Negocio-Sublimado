package com.sublimado.eCommerce.service;

import com.sublimado.eCommerce.model.Province;
import com.sublimado.eCommerce.repository.IProvinceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvinceService implements IProvinceService{

    @Autowired
    private IProvinceRepository provinceRepository;

    @Override
    public void saveProvince(Province province) {
        provinceRepository.save(province);
    }

    @Override
    public Province getProvince(Long idProvince) throws Exception {
        return provinceRepository.findById(idProvince)
                .orElseThrow(()-> new Exception("El id no ha sido encontrado"));
    }

    @Override
    public List<Province> provinces() {
        return provinceRepository.findAll();
    }

    @Override
    public void updateProvince(Province province, Long idProvince) throws Exception {
        Province provinceBD = this.getProvince(idProvince);
        provinceBD = province;
        provinceBD.setIdProvince(idProvince);
        provinceRepository.save(provinceBD);
    }

    @Override
    public void deleteProvince(Long idProvince) {
        provinceRepository.deleteById(idProvince);
    }
}
