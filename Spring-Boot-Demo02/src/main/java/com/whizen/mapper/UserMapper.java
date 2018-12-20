package com.whizen.mapper;

import java.util.List;

import com.whizen.entity.User;

public interface UserMapper {
	
	//根据ID查询用户对象
	public User get(Integer id);
	
	
	//根据条件查询用户列表
	public List<User> list();

}
