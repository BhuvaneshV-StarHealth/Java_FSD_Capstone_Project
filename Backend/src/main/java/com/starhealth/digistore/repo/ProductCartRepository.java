package com.starhealth.digistore.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.starhealth.digistore.entity.ProductCart;

@Repository
public interface ProductCartRepository extends JpaRepository<ProductCart,Integer> {

	//@Query("delete from ProductCart where productID = ?1 and userName = ?2")
	//public void deleteByPrimaryKey(int productID,String productName);
	
}
