package in.asterisc.Day14.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import in.asterisc.Day14.model.User;
import in.asterisc.Day14.repository.UserDetailsImpliments;
import in.asterisc.Day14.repository.UserRepository;

@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository repo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		User user=repo.findByUname(username);
		
		if(user==null)
			throw new UsernameNotFoundException("User not found");
		
		return new UserDetailsImpliments(user);
	}
	
}

