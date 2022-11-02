package com.inxinet.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inxinet.webservice.entities.Category;

public interface CategoryRepository extends JpaRepository<Category	, Long>{

}
