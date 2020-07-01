package com.eCommerce.product.controller;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.eCommerce.product.config.CloudConfig;
import com.eCommerce.product.entity.ProductAddUpdate;
import com.eCommerce.product.entity.ProductEntity;
import com.eCommerce.product.service.ProductService;

/*
 * @author : Monika Prasad
 * 
 */
@RestController
@RequestMapping("/api/product-mgmt")
public class ProductController {

	@Autowired
	ProductService productService;
	
	@Autowired
	CloudConfig cloudConfig;
	
	@Value("${welcome.message}")
	private String welcomeText;
	 
	@GetMapping("/welCome/")
	public String welCome() {
		return welcomeText;
	}
	@GetMapping("/")
	public String getConfigData() {
		return cloudConfig.getName();
	}
	
	@GetMapping("/api/monika")
	public String getMyName() {
		return "monika";
	}
	
	@GetMapping("/products/recommendations")
	public List<ProductEntity> getRecommendProducts() {
		return productService.getRecommendProducts();
	}
	
	@GetMapping("/fetch/products")
	public Optional<ProductEntity> getProduct(@RequestParam int uniqueid) {
		return productService.fetchProduct(uniqueid);
	}
	
	@PostMapping("/addOrupdate/products")
	public ProductAddUpdate addProducts(@RequestBody ProductEntity productEntity) throws Exception {
		return productService.addProducts(productEntity);
	}
	
	@PutMapping("/remove/products")
	public ProductAddUpdate deleteProducts(@RequestParam int uniqueid) throws Exception {
		return productService.deleteProducts(uniqueid);
	}

}
