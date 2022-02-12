package com.crudauth.crudauthentication.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.crudauth.crudauthentication.model.Role;
import com.crudauth.crudauthentication.model.User;
import com.crudauth.crudauthentication.repository.RoleRepo;
import com.crudauth.crudauthentication.repository.UserRepo;

import lombok.RequiredArgsConstructor;

@Service 
@RequiredArgsConstructor
public class UserServiceImp implements UserService {

	private final UserRepo userRepo;
	private final RoleRepo roleRepo;
	
	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Role saveRole(Role role) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addRoleToUser(String username, String roleName) {
		// TODO Auto-generated method stub
		User user = userRepo.findByUsername(username);
		Role role = roleRepo.findByName(roleName);
		user.getRoles().add(role);
	}
	
	public User getUser(String username) {
		return userRepo.findByUsername(username);
	}

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

}
