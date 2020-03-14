package com.example.demo.dao;

import com.example.demo.entity.UserInfo;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
@Mapper
@Component
public interface UserInfoMapper {
    int deleteByPrimaryKey(String userId);

    int insert(UserInfo record);

    UserInfo selectByPrimaryKey(String userId);

    List<UserInfo> selectAll();

    int updateByPrimaryKey(UserInfo record);
    
    UserInfo login(String userName,String userPassword);
}