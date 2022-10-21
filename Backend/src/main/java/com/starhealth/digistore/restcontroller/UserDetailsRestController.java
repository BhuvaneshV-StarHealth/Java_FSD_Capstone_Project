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
import com.starhealth.digistore.entity.UserDetails;
import com.starhealth.digistore.service.IUserDetailsService;

/*
 * @Author Bhuvanesh V
 * Date - 20-10-2022
 * Description - 
 * 
 */
@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/starhealth/digistore/user")
public class UserDetailsRestController {

	@Autowired
	IUserDetailsService service;
	
	/*@GetMapping("/login/{uemail}/{urole}")
	public String userLogin(@PathVariable String uemail, @PathVariable String urole) {
		return service.findByuser(uemail,urole);
	}*/
	
	@GetMapping("/login/{uemail}/{urole}")
	public UserDetails userLogin(@PathVariable String uemail, @PathVariable String urole) {
		return service.findByuser(uemail,urole);
	}
	
	@PostMapping("/register")
	public UserDetails userregister(@RequestBody UserDetails u) {
		UserDetails user = userLogin(u.getUseremail(),u.getUserRole());
		System.out.println(user);
		if(user==null) {
			System.out.println("New entry");
			return service.register(u);
		}
		else {
			System.out.println("Record already present");
			return null;
			//return "User details already present login to continue or register with new email id";
		}
		//return service.register(u);
	}
}
