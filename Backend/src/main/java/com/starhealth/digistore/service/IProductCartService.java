package com.starhealth.digistore.service;

import java.util.List;

import com.starhealth.digistore.entity.ProductCart;

public interface IProductCartService {

	public ProductCart addProductCart(ProductCart p);
	public void deleteProductCart(int id);
	public List<ProductCart> displayProductCart();
}
