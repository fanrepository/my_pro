package com.whizen.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.whizen.entity.User;
import com.whizen.mapper.UserMapper;
import com.whizen.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper mapper;
	
	@Override
	public User get(Integer id) {
		System.out.print("-----");
		return this.mapper.get(id);
		
	}
	
	 @Override
	 public List<User> list() {
		 return this.mapper.list();	
	}

}
