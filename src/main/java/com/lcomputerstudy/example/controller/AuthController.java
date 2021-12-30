package com.lcomputerstudy.example.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lcomputerstudy.example.config.JwtUtils;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth")
public class AuthController {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
//	@Autowired
//	AuthenticationManager authenticationManager;
//	
//	@Autowired
//	PasswordEncoder encoder;
//	
//	@Autowired
//	JwtUtils jwtUtils;
//	
//	@Autowired
//	UserService userService;
//	
//	@PostMapping("/signin")
//	public ResponseEntity<?> authenticateUser(@Validated @RequestBody LoginRequest loginRequest) {
//		
//		logger.info("test" + loginRequest);
//		
//		Authentication authentication = authenticationManager.authenticate(
//							new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));
//		
//		SecurityContextHolder.getContext().setAuthentication(authentication);
//		String jwt = jwtUtils.generateJwtToken(authentication);
//		
//		User user = (User) authentication.getPrincipal();
//		logger.info("dddd"+authentication.getPrincipal());
//		List<String> roles = user.getAuthorities().stream()
//				.map(item -> item.getAuthority())
//				.collect(Collectors.toList());
//		
//		return ResponseEntity.ok(new JwtResponse(jwt,
//																	user.getUsername(),
//																	user.getName(),
//																	roles));
//				
//	}
//	
//	@PostMapping("/signup")
//	public ResponseEntity<?> signupUser(@Validated @RequestBody JoinRequest joinRequest) {
//		
//		String encodedPassword = new BCryptPasswordEncoder().encode(joinRequest.getPassword());
//		
//		User user = new User();
//		
//		user.set
//	}
//	
//	

}
