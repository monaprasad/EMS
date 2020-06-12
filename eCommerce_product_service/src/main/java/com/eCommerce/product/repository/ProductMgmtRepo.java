/**
 * 
 */
package com.eCommerce.product.repository;

import org.springframework.data.repository.CrudRepository;

import com.eCommerce.product.entity.ProductEntity;

/**
 * @author Ajit Kumar
 *
 */
public interface ProductMgmtRepo extends CrudRepository<ProductEntity, Integer> {

}
