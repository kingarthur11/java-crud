package com.crudauth.crudauthentication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crudauth.crudauthentication.model.User;

public interface UserRepo extends JpaRepository<User, Long> {
	User findByUsername(String username);
}

