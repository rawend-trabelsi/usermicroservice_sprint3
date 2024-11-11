package com.rawend.users.service;

import java.util.List;

import com.rawend.users.entities.Role;
import com.rawend.users.entities.User;
import com.rawend.users.service.register.RegistationRequest;

public interface UserService {
	User saveUser(User user);
	User findUserByUsername (String username);
	Role addRole(Role role);
	User addRoleToUser(String username, String rolename);
	List<User> findAllUsers();
	public User registerUser(RegistationRequest request) ;

	void sendEmailUser(User u, String code);
	public User validateToken(String code);
}