package com.inxinet.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inxinet.webservice.entities.User;

public interface UserRepository extends JpaRepository<User	, Long>{

}
