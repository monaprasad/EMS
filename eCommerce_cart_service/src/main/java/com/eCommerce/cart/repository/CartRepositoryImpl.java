package com.eCommerce.cart.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;

import org.springframework.stereotype.Repository;

import com.eCommerce.cart.entity.CartAddUpdate;
import com.eCommerce.cart.entity.CartDetailEntity;
import com.eCommerce.cart.entity.CartEntity;

@Repository
public class CartRepositoryImpl implements CartRepository{
	
	private static final String GD_GET_CART_DETAILS = "product.GetAllCartProductsPrice";
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<CartDetailEntity> fetchCart() {
		List<CartDetailEntity> resultSet  = new ArrayList<CartDetailEntity>();
		StoredProcedureQuery storedProcedureQuery = entityManager.createStoredProcedureQuery(GD_GET_CART_DETAILS,
				CartDetailEntity.class);
        resultSet = storedProcedureQuery.getResultList();
		entityManager.close();
		return resultSet;
	}

	@Override
	public CartAddUpdate createCart() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CartAddUpdate updateCart() {
		// TODO Auto-generated method stub
		return null;
	}

}
