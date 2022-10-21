package com.starhealth.digistore.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.starhealth.digistore.entity.UserDetails;

public interface UserDetailsRepository extends JpaRepository<UserDetails, Integer>{

	//public List<UserDetails> findByuseremail(String userEmail);
	//@Query("select u.userName from UserDetails u where useremail = ?1 and userRole = ?2")
	//public String findByuser(String userEmail,String userRole);
	@Query("select u from UserDetails u where useremail = ?1 and userRole = ?2")
	public UserDetails findByuser(String userEmail,String userRole);
}
