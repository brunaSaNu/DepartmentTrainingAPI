package com.brusanu.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brusanu.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
