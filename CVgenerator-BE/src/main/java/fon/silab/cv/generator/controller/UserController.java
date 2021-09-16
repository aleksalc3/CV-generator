package fon.silab.cv.generator.controller;




import java.security.Principal;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fon.silab.cv.generator.dto.MyUserDetails;
import fon.silab.cv.generator.service.security.MyUserDetailsService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/users")
public class UserController {
	
	@Autowired
	MyUserDetailsService myUserDetailsService;
	
	@GetMapping("login")
	public MyUserDetails findAllUsers(Principal prinicipal) {
		
		return (MyUserDetails) ((UsernamePasswordAuthenticationToken)prinicipal).getPrincipal();

	}
	
	
}
