package com.eCommerce.product.repository;

import java.util.List;

import com.eCommerce.product.entity.ProductAddUpdate;
import com.eCommerce.product.entity.ProductEntity;

public interface ProductRepository {
	
	 List<ProductEntity> getRecommendProducts();

	 ProductEntity fetchProduct();
	 
	 ProductAddUpdate addProducts();
	 
	 ProductAddUpdate updateProducts();

}
