package com.vueling.team4.security.service;

import java.util.Optional;

import com.vueling.team4.security.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.vueling.team4.security.domain.Usuario;

@Service
public class UserDetailServiceImpl implements UserDetailsService {
	
	@Autowired
    UserRepository repository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<Usuario> usuario = repository.findByUsername(username);
		if (!usuario.isPresent())
			return null;
		return UsuarioPrincipal.build(usuario.get());
	}

}