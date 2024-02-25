package eshop.home.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import eshop.home.entity.ProductInfo;

@Repository
public interface ProductInfoRepository1 extends JpaRepository<ProductInfo, String> {

}
