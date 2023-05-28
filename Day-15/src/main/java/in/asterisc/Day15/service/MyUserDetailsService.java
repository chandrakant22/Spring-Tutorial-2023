package in.asterisc.Day15.service;



import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import in.asterisc.Day15.model.User;
import in.asterisc.Day15.repository.UserDetailsImpliments;
import in.asterisc.Day15.repository.UserRepository;
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
