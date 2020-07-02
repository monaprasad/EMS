package com.eCommerce.cart.request.bean;

import java.math.BigDecimal;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddUpdateCartRequestBean {
	/**
	 * variable of item
	 */
	private List item;
	
	/**
	 * variable of total
	 */
	private BigDecimal total;
	
	/**
	 * variable of currency
	 */
	private String currency;

}
