package com.crudauth.crudauthentication.service;

import java.util.List;

import com.crudauth.crudauthentication.model.Role;
import com.crudauth.crudauthentication.model.User;

public interface UserService {
	User saveUser(User user);
	Role saveRole(Role role);
	void addRoleToUser(String username, String roleName);
	User getUser(String username);
	List<User>getUsers();
}
