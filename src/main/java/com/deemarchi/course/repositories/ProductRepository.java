package com.deemarchi.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deemarchi.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
}
