package com.sublimado.eCommerce.service;

import com.sublimado.eCommerce.model.Order;
import com.sublimado.eCommerce.repository.IOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService implements IOrderService{

    @Autowired
    private IOrderRepository orderRepository;

    @Override
    public void saveOrder(Order order) {
        orderRepository.save(order);
    }

    @Override
    public Order getOrder(Long idOrder) throws Exception {
        return orderRepository.findById(idOrder)
                .orElseThrow(() -> new Exception("El id no ha sido encontrado"));
    }

    @Override
    public List<Order> orders() {
        return orderRepository.findAll();
    }

    @Override
    public void updateOrder(Order order, Long idOrder) throws Exception {
        Order orderBD = this.getOrder(idOrder);
        orderBD = order;
        orderBD.setIdOrder(idOrder);
        orderRepository.save(orderBD);
    }

    @Override
    public void deleteOrder(Long idOrder) {
        orderRepository.deleteById(idOrder);
    }
}
