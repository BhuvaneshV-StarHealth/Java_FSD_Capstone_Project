package com.starhealth.digistore.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.starhealth.digistore.entity.Product;
import com.starhealth.digistore.service.IProductService;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/starhealth/digistore/product")
public class ProductRestController {

	@Autowired
	IProductService service;
	
	@PostMapping("/addproduct")
	public Product add(@RequestBody Product p) {
		return service.addProduct(p);
	}
	//String pname,int price,int quantity,String image,int id
	@PutMapping("/updateproduct/{pname}/{price}/{quantity}/{image}/{id}")
	public void update(@PathVariable String pname,@PathVariable double price,@PathVariable int quantity,@PathVariable String image,@PathVariable int id) {
		service.updateProduct(pname, price, quantity, image, id);
	}
	
	@DeleteMapping("/deleteproduct/{id}")
	public String delete(@PathVariable int id) {
		service.deleteProduct(id);
		return "Product id "+id+" deleted successfully";
	}
	
	@GetMapping("/getproductid/{id}")
	public Product getById(@PathVariable int id) {
		return service.getProductById(id);
	}
	
	@GetMapping("/displayproduct")
	public List<Product> displayAll(){
		return service.displayProduct();
	}
}
