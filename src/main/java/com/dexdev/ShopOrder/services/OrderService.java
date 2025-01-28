package com.dexdev.ShopOrder.services;

import com.dexdev.ShopOrder.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private ShippingService shippingService;

    public double Total(Order order) {
        return (order.getPrice() - order.getDiscount()) + shippingService.Shipment(order);
    }
}
