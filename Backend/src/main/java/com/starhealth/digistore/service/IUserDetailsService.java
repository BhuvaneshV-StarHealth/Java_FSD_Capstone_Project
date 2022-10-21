package com.starhealth.digistore.service;


import java.util.List;

import com.starhealth.digistore.entity.UserDetails;

public interface IUserDetailsService {
	
	public UserDetails register(UserDetails u);
	//public String findByuser(String userEmail,String userRole);
	public UserDetails findByuser(String userEmail,String userRole);

}
