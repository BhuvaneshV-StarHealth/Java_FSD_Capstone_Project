package com.starhealth.digistore.restcontroller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.starhealth.digistore.entity.ProductCart;
import com.starhealth.digistore.service.IProductCartService;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/starhealth/digistore/productcart")
public class ProductCartRestController {

	@Autowired
	IProductCartService service;
	
	@PostMapping("/addproductcart")
	public ProductCart add(@RequestBody ProductCart p) {
		return service.addProductCart(p);
	}
	
	/*@DeleteMapping("/deleteproductcart/{pid}")
	public String delete(@PathVariable int pid) {
		service.deleteProductCart(pid);
		return "Product deleted from cart successfully";
	}*/
	
	@DeleteMapping("/deleteproductcart/{pid}")
	public void delete(@PathVariable int pid) {
		service.deleteProductCart(pid);
		//return "Product deleted from cart successfully";
	}
	
	
	@GetMapping("/displayproductcart")
	public List<ProductCart> displayAll(){
		return service.displayProductCart();
	}
}
