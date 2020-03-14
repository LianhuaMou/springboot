package com.example.demo;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.dao.UserInfoMapper;
import com.example.demo.entity.UserInfo;
import com.example.demo.service.UserInfoService;
@SpringBootTest
@RunWith(SpringRunner.class)
class DemoApplicationTests {

	@Autowired
	private UserInfoService userInfoService;
	@Test
	void contextLoads() {
		//System.out.println("大功告成："+userInfoMapper.selectAll());
		System.out.println("大功告成："+userInfoService.getUserName("1"));
	}
	/**
	 * 
	 */
	@Test
	public void insert(){
		UserInfo userInfo=new UserInfo();
		userInfo.setUserId("4");
		userInfo.setUserName("珊珊");
		userInfo.setAddress("北京");
		userInfo.setSex("女");
		userInfo.setBirthday(new Date());
		userInfo.setAge(5l);
		userInfo.setUserPassword("123456");
		userInfoService.insert(userInfo);
	}
}
