package fon.silab.cv.generator.service.security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import fon.silab.cv.generator.dao.UserJpaRepository;
import fon.silab.cv.generator.dto.MyUserDetails;
import fon.silab.cv.generator.entity.User;

@Service
public class MyUserDetailsService implements UserDetailsService{
	private UserJpaRepository userJpaRepository;
	
	@Autowired
	public MyUserDetailsService(UserJpaRepository userJpaRepository) {
		this.userJpaRepository = userJpaRepository;		
	}
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		System.out.println("=========================================================");
		System.out.println(username);
		Optional<User> user = userJpaRepository.findByUsername(username);
		user.orElseThrow(()->new UsernameNotFoundException("user with " + username +" does not exist"));
		return new  MyUserDetails(
					user.get().getUsername(),
					user.get().getPassword(),
					user.get().getFirstname(),
					user.get().getLastname());
	}

}
