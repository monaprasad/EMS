package com.eCommerce.product.service;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import com.eCommerce.product.entity.ProductAddUpdate;
import com.eCommerce.product.entity.ProductEntity;

public interface ProductService {
	
	 List<ProductEntity> getRecommendProducts();

	 ProductAddUpdate addProducts(ProductEntity productEntity) throws Exception;
	 
	ProductAddUpdate deleteProducts(int uniqueid) throws Exception;

	Optional<ProductEntity> fetchProduct(int uniqueid);

}
