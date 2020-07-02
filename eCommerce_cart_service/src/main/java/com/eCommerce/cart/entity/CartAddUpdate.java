package com.eCommerce.cart.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
public class CartAddUpdate implements Serializable{
		
		/**
		 * variable of row id, That is unique for row.
		 */
		@Id
		private Integer uniqueid;
		/**
		 * variable of return code.
		 */
		private Integer retcode;
		/**
		 * variable of return message.
		 */
		private String retmessage;
		
}
