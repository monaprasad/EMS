package com.eCommerce.cart.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eCommerce.cart.entity.CartAddUpdate;
import com.eCommerce.cart.entity.CartDetailEntity;
import com.eCommerce.cart.entity.CartEntity;
import com.eCommerce.cart.repository.CartMgmtRepo;
import com.eCommerce.cart.repository.CartRepository;

@Service
public class CartServiceImpl implements CartService{
	
	@Autowired
	CartMgmtRepo repo;
	
	@Autowired
	CartRepository cartRepository;
	
	@Override
	public List<CartDetailEntity> fetchCart() {
		return cartRepository.fetchCart();
	}

	@Override
	public CartAddUpdate createCart(CartEntity data) throws Exception {
		CartAddUpdate response=new CartAddUpdate();
		try {
			 repo.save(data);
			 response.setUniqueid(1);
			 response.setRetcode(0);
			 response.setRetmessage("product added in cart successfully");
			 return response;
			
		}catch(Exception e) {
			e.printStackTrace();
			 response.setUniqueid(1);
			 response.setRetcode(-1);
			 response.setRetmessage("database exception");
		}
		return response;
	}

	@Override
	public CartAddUpdate removeCart(int uniqueid) throws Exception {
		CartAddUpdate response=new CartAddUpdate();
		try {
			 repo.deleteById(uniqueid);
			 response.setUniqueid(1);
			 response.setRetcode(0);
			 response.setRetmessage("cart item has been  removed  successfully");
			 return response;
			
		}catch(Exception e) {
			e.printStackTrace();
			 response.setUniqueid(1);
			 response.setRetcode(-1);
			 response.setRetmessage("database exception");
		}
		return response;
	}

}
