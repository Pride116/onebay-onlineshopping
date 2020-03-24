package com.onebay.onlineShopping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.onebay.onlineShopping.model.User;
import com.onebay.onlineShopping.model.UserPrincipal;
import com.onebay.onlineShopping.repository.UserRepository;

@Service
public class customUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository userrepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userrepo.findByUserName(username);

		if (user == null) {
			throw new UsernameNotFoundException("username " + username + " doesn't exsist");
		}

		return new UserPrincipal(user);
	}

}
