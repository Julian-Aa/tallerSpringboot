package com.eam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eam.models.User;

public interface IAUserRepository extends JpaRepository<User, Long>{
	
}
