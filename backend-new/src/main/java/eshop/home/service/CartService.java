package eshop.home.service;

import java.util.Collection;

import eshop.home.entity.Cart;
import eshop.home.entity.ProductInOrder;
import eshop.home.entity.User;

public interface CartService {
    Cart getCart(User user);

    void mergeLocalCart(Collection<ProductInOrder> productInOrders, User user);

    void delete(String itemId, User user);

    void checkout(User user);
}
