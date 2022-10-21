package com.starhealth.digistore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.starhealth.digistore.entity.UserDetails;
import com.starhealth.digistore.repo.UserDetailsRepository;

@Service
public class UserDetailsService implements IUserDetailsService {

	@Autowired
	UserDetailsRepository repo;
	
	/*@Override
	public String findByuser(String userEmail,String userRole) {
		// TODO Auto-generated method stub
		return repo.findByuser(userEmail,userRole);
	}*/
	
	@Override
	public UserDetails findByuser(String userEmail,String userRole) {
		// TODO Auto-generated method stub
		return repo.findByuser(userEmail,userRole);
	}
	

	@Override
	public UserDetails register(UserDetails u) {
		// TODO Auto-generated method stub
		return repo.save(u);
	}

}
