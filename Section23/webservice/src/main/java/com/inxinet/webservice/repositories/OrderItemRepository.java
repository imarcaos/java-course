package com.inxinet.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inxinet.webservice.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
