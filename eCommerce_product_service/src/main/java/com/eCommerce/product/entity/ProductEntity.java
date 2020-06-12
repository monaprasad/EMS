package com.eCommerce.product.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Monika Prasad
 * @implNote Entity Class responsible to map DB result set of product mgmt 
 */
@Getter
@Setter
@Entity
@Table(name = "productmgmt")
public class ProductEntity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * variable of unique id, That is unique value.
	 */
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int uniqueid;
	
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
	

}
