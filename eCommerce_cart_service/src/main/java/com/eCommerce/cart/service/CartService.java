package com.eCommerce.cart.service;

import java.io.Serializable;
import java.util.List;

import com.eCommerce.cart.entity.CartAddUpdate;
import com.eCommerce.cart.entity.CartDetailEntity;
import com.eCommerce.cart.entity.CartEntity;



public interface CartService {
	
	List<CartDetailEntity> fetchCart();
	
	CartAddUpdate createCart(CartEntity data) throws Exception;

	CartAddUpdate removeCart(int uniqueid) throws Exception;

}
