package com.starhealth.digistore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.starhealth.digistore.entity.Product;
import com.starhealth.digistore.repo.ProductRepository;

@Service
public class ProductService implements IProductService {

	@Autowired
	ProductRepository repo;
	
	@Override
	public Product addProduct(Product p) {
		// TODO Auto-generated method stub
		return repo.save(p);
	}

	@Override
	public void updateProduct(String pname,double price,int quantity,String image,int id) {
		// TODO Auto-generated method stub
		repo.updateProduct(pname, price, quantity, image, id);
	}

	@Override
	public void deleteProduct(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}
	
	@Override
	public Product getProductById(int id) {
		return repo.getProductById(id);
	}

	@Override
	public List<Product> displayProduct() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
