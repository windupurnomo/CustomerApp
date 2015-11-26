package com.sciencom.training.customerapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.sciencom.training.customerapp.model.User;

@Service("userDetailSvc")
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserService userService;

	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userService.getByUsername(username);
		System.out.println("User : " + user);
		if (user == null) {
			System.out.println("User not found");
			throw new UsernameNotFoundException("Username not found");
		}
		boolean isActive = true;
		return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), isActive,
				true, true, true, getGrantedAuthorities(user));
	}

	private List<GrantedAuthority> getGrantedAuthorities(User user) {
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();

		// for(UserProfile userProfile : user.getUserProfiles()){
		// System.out.println("UserProfile : "+userProfile);
		// authorities.add(new
		// SimpleGrantedAuthority("ROLE_"+userProfile.getType()));
		// }
		System.out.print("authorities :" + authorities);
		return authorities;
	}

}
