package com.eCommerce.cart.repository;

import java.util.List;

import com.eCommerce.cart.entity.CartAddUpdate;
import com.eCommerce.cart.entity.CartDetailEntity;
import com.eCommerce.cart.entity.CartEntity;

public interface CartRepository {
	
    List<CartDetailEntity> fetchCart();
	
	CartAddUpdate createCart();
	
	CartAddUpdate updateCart();

}
