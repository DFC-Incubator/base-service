package org.irods.jargon.rest.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class IrodsUserDetailsService implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(final String arg0) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
