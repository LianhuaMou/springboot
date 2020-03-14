package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.UserInfo;

public interface UserInfoService {

	String getUserName(String userId);
	
	public List<UserInfo> selectAll();
	
	public int insert(UserInfo userInfo);
	 
	public int delete(String id);
	        
    public int UpdateUser(UserInfo userInfo);
    
    public String login(String userName,String userPassword);
}
