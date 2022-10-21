package com.starhealth.digistore.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.starhealth.digistore.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer>{

	@Query("select p from Product p where productID = ?1")
	public Product getProductById(int id);
	
	@Query("update Product set productName = ?1,productPrice = ?2,productQuantity = ?3,productImage = ?4 where productID = ?5")
	public void updateProduct(String pname,double price,int quantity,String image,int id);
	
}
