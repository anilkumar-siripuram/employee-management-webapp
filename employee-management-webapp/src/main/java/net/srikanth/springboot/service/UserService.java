package net.srikanth.springboot.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import net.srikanth.springboot.dto.UserRegistrationDto;
import net.srikanth.springboot.model.User;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
