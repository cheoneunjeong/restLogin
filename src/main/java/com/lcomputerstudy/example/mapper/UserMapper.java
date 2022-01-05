package com.lcomputerstudy.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.security.core.GrantedAuthority;

import com.lcomputerstudy.example.domain.User;
import com.lcomputerstudy.example.domain.UserInfo;

@Mapper
public interface UserMapper {
	
	public User readUser(String username);
	
	public UserInfo readUser_refresh(String uesrname);
	
	public List<GrantedAuthority> readAuthorities_refresh(String username);
	
	public void createUser(User user);
	
//	public List<UserInfo> readUserList();
	
	public List<UserInfo> read_user_list();
	
//	public List<UserInfo> readAuthorities_all();

	public List<GrantedAuthority> readAuthorities(String username);
	
	public void createAuthority(User user);
	
	

}
