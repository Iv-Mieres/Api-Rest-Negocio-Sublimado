package com.sublimado.eCommerce.service;

import com.sublimado.eCommerce.model.Order;

import java.util.List;

public interface IOrderService {

    void saveOrder(Order order);
    Order getOrder(Long idOrder) throws Exception;
    List<Order> orders();
    void updateOrder(Order order, Long idOrder) throws Exception;
    void deleteOrder(Long idOrder);
}
