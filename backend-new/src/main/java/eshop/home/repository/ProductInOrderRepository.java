package eshop.home.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import eshop.home.entity.ProductInOrder;

public interface ProductInOrderRepository extends JpaRepository<ProductInOrder, Long> {

}
