package org.eclipse.FirstSpringMvc.security;

import org.eclipse.FirstSpringMvc.dao.UserRepository;
import org.eclipse.FirstSpringMvc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	
	
	@Autowired
	UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		
		System.out.println(username);
		User user =userRepository.findByUserName(username);
		if(username == null)
			throw new UsernameNotFoundException("No user named "+username);
		else
			return new UserDetailsImpl(user);
	}

}
