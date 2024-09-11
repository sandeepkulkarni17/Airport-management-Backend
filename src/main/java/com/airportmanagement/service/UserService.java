package com.airportmanagement.service;

import com.airportmanagement.model.User;
import com.airportmanagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Set;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public User createUser(String username, String password, String role) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(passwordEncoder.encode(password));
        user.setRoles(Collections.singleton(role));
        return userRepository.save(user);
    }

    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteUser(Long id) {
		// TODO Auto-generated method stub
		
	}

	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	public void createUser(String username, String password, Set<String> singleton) {
		// TODO Auto-generated method stub
		
	}
}
