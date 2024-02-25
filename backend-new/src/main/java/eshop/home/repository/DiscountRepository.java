package eshop.home.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import eshop.home.entity.Discount;

public interface DiscountRepository extends JpaRepository<Discount, String> {

}
