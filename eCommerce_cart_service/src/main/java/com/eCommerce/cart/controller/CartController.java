package com.eCommerce.cart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.eCommerce.cart.entity.CartAddUpdate;
import com.eCommerce.cart.entity.CartDetailEntity;
import com.eCommerce.cart.entity.CartEntity;
import com.eCommerce.cart.service.CartService;

@RestController
@RequestMapping("/api/cart-mgmt")
public class CartController {
	
	@Autowired
	CartService cartService;


	@GetMapping("/fetch/cart")
	public @ResponseBody List<CartDetailEntity> fetchCart() {
		return cartService.fetchCart();
	}
	
	@PostMapping("/create/cart")
	public CartAddUpdate createCart(@RequestBody CartEntity data) throws Exception {
		return	cartService.createCart(data);
	}
	
	@PutMapping("/remove/cart")
	public CartAddUpdate removeCart(@RequestParam int uniqueid) throws Exception {
		CartAddUpdate removeCart = cartService.removeCart(uniqueid);
		return removeCart;
	}
}
