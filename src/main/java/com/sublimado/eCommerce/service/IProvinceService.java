package com.sublimado.eCommerce.service;

import com.sublimado.eCommerce.model.Province;

import java.util.List;

public interface IProvinceService {

    void saveProvince(Province province);
    Province getProvince(Long idProvince) throws Exception;
    List<Province> provinces();
    void updateProvince(Province province, Long idProvince) throws Exception;
    void deleteProvince(Long idProvince);
}
