package com.crudauth.crudauthentication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crudauth.crudauthentication.model.Role;

public interface RoleRepo extends JpaRepository<Role, Long> {
	Role findByName(String name);
}