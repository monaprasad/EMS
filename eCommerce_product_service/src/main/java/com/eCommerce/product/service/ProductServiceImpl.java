package com.eCommerce.product.service;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eCommerce.product.entity.ProductAddUpdate;
import com.eCommerce.product.entity.ProductEntity;
import com.eCommerce.product.repository.ProductMgmtRepo;

/*
 * @author : Monika Prasad
 * 
 */
@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductMgmtRepo repo;

	@Override
	public List<ProductEntity> getRecommendProducts() {
		List<ProductEntity> data=(List<ProductEntity>) repo.findAll();
		return data;
	}

	@Override
	public Optional<ProductEntity> fetchProduct(int uniqueid) {
		Optional<ProductEntity> data=repo.findById(uniqueid);
		return data;
	}

	@Override
	public ProductAddUpdate addProducts(ProductEntity productEntity) throws Exception {
		ProductAddUpdate response =new ProductAddUpdate();
		try {
			 repo.save(productEntity); 
			 response.setUniqueid(1);
			 response.setRetcode(0);
			 response.setRetmessage("product has beed added or updated in cart successfully");
			 return response;
		}catch(Exception e) {
			e.printStackTrace();
			 response.setUniqueid(1);
			 response.setRetcode(-1);
			 response.setRetmessage("database exception");
		}
		return response;
	}

	public ProductAddUpdate deleteProducts(int uniqueid) throws Exception {
		ProductAddUpdate response =new ProductAddUpdate();
		try {
			 repo.deleteById(uniqueid);
			 response.setUniqueid(1);
			 response.setRetcode(0);
			 response.setRetmessage("product has beed removed in cart successfully");
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
