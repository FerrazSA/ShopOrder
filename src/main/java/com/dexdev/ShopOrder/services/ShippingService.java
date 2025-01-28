package com.dexdev.ShopOrder.services;

import com.dexdev.ShopOrder.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double Shipment(Order order) {
        if (order.getPrice() < 100){
            return 20;
        } else if (order.getPrice() >= 100 && order.getPrice() < 200){
            return 12;
        } else {
            return 0;
        }
    }
}
