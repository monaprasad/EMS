package com.eCommerce.cart.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class CartDetailEntity implements Serializable{

	@Id
	@Column(name = "id")
	private Integer id;
	
	
	@Column(name = "prod_id")
	private Integer prod_id;
	
	/**
	 * variable of prodName
	 */
	@Column(name = "product_name")
	private String prodName;
	
	/**
	 * variable of description
	 */
	@Column(name = "product_desc")
	private String description;
	
	/**
	 * variable of price
	 */
	@Column(name = "product_price")
	private BigDecimal price;
	
	/**
	 * variable of currency
	 */
	@Column(name = "product_currency")
	private String currency;
	
	/**
	 * variable of Total_price
	 */
	@Column(name = "Total_price")
	private String Total_price;
	
	/**
	 * variable of total_cart_count
	 */
	@Column(name = "total_cart_count")
	private String total_cart_count;
	
	/**
	 * variable of total_cart_count
	 */
	@Column(name = "cart_status")
	private Integer cart_status;
}
