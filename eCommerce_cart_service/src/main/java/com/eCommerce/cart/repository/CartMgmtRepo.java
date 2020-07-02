package com.eCommerce.cart.repository;

import org.springframework.data.repository.CrudRepository;

import com.eCommerce.cart.entity.CartEntity;
/**
 * @author Monika Prasad
 */
public interface CartMgmtRepo extends CrudRepository<CartEntity, Integer> {

}
