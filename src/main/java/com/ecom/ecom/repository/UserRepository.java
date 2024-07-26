package com.ecom.ecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecom.ecom.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
