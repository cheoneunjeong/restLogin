package com.lcomputerstudy.example.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lcomputerstudy.example.config.JwtUtils;
import com.lcomputerstudy.example.domain.UserInfo;
import com.lcomputerstudy.example.service.BoardService;
import com.lcomputerstudy.example.service.UserService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/admin")
public class AdminController {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	AuthenticationManager authenticationManager;
	
	@Autowired
	PasswordEncoder encoder;
	
	@Autowired
	BoardService boardService;
	
	@Autowired
	JwtUtils jwtUtils;
	
	@Autowired
	UserService userService;
	
		public ResponseEntity<?> AccessAdmin(HttpServletRequest request) {
//			String token = request.getHeader("Authorization");
//			String token2 = new String();
//			if(StringUtils.hasText(token)&&token.startsWith("Bearer")) {
//				token2 = token.substring(7, token.length());
//			}
			
			List<UserInfo> userList = userService.read_user_list();
			logger.info(userList.toString());
				return new ResponseEntity<>(userList, HttpStatus.OK);
				
//			return ResponseEntity.ok(new JwtResponse1(
//																			userList,
//																			userList_auth));
		}

}
