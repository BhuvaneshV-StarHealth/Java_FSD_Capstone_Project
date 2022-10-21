package com.starhealth.digistore.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.starhealth.digistore.entity.ProductCart;
import com.starhealth.digistore.repo.ProductCartRepository;

@Service
public class ProductCartService implements IProductCartService {

	@Autowired
	ProductCartRepository repo;
	
	/*
	 * Author: Bhuvanesh V
	 * Date: 20-10-2022
	 * Description: 
	 * Params: 
	 * return:
	 * Exception:
	 */
	@Override
	public ProductCart addProductCart(ProductCart p) {
		// TODO Auto-generated method stub
		return repo.save(p);
	}

	@Override
	public void deleteProductCart(int productID) {
		// TODO Auto-generated method stub
		repo.deleteById(productID);
	}

	@Override
	public List<ProductCart> displayProductCart() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
