package eshop.home.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import eshop.home.entity.Discount;

public interface DiscountService {

	Discount createCoupon(String code,Long d_price);

	Page<Discount> findAll(PageRequest request);

	void deleteCoupon(String code);

	List<Discount> findAll();

}
