package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserInfoMapper;
import com.example.demo.entity.UserInfo;
import com.example.demo.service.UserInfoService;

@Service
public class UserInfoServiceImpl implements UserInfoService{

	@Autowired
	private UserInfoMapper userInfoMapper;
	
	@Override
	public String getUserName(String userId) {
		UserInfo userInfo = userInfoMapper.selectByPrimaryKey(userId);
		if(userInfo == null) {
			return null;
		}
		return userInfo.getUserName();
	}

	@Override
	public List<UserInfo> selectAll() {
		// TODO Auto-generated method stub
		return userInfoMapper.selectAll();
	}

	@Override
	public int insert(UserInfo userInfo) {
		// TODO Auto-generated method stub
		return userInfoMapper.insert(userInfo);
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return userInfoMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int UpdateUser(UserInfo userInfo) {
		// TODO Auto-generated method stub
		return userInfoMapper.updateByPrimaryKey(userInfo);
	}

	@Override
	public String login(String userName, String userPassword) {
		// TODO Auto-generated method stub
		return userInfoMapper.login(userName, userPassword).getUserName();
	}


	

}
