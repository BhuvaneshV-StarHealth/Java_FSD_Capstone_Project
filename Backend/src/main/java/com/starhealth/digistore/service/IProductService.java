package com.starhealth.digistore.service;

import java.util.List;

import com.starhealth.digistore.entity.Product;

public interface IProductService {

	public Product addProduct(Product p);
	public void updateProduct(String pname,double price,int quantity,String image,int id);
	public void deleteProduct(int id);
	public List<Product> displayProduct();
	public Product getProductById(int id);
}
