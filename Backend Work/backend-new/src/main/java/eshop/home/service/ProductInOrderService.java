package eshop.home.service;

import eshop.home.entity.ProductInOrder;
import eshop.home.entity.User;


public interface ProductInOrderService {
    void update(String itemId, Integer quantity, User user);
    ProductInOrder findOne(String itemId, User user);
}
