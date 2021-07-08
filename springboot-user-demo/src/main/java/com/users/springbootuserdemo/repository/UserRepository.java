package com.users.springbootuserdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.users.springbootuserdemo.model.User;


public interface  UserRepository extends JpaRepository<User, Long>{ 

}
