package com.eCommerce.product.request.bean;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddUpdateProductRequestBean {

	/**
	 * variable of prodName
	 */
	private String prodName;
	
	/**
	 * variable of description
	 */
	private String description;
	
	/**
	 * variable of price
	 */
	private BigDecimal price;
	
	/**
	 * variable of currency
	 */
	private String currency;
	
}
