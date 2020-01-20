package com.deemarchi.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deemarchi.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
}
