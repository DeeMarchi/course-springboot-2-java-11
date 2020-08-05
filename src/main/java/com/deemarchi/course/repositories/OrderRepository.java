package com.deemarchi.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deemarchi.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
}
