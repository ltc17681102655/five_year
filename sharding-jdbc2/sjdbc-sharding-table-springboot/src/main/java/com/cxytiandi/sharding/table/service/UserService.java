package com.cxytiandi.sharding.table.service;

import java.util.List;

import com.cxytiandi.sharding.table.po.User;

public interface UserService {

	List<User> list();
	
	Long add(User user);
	
	User findById(Long id);
	
	User findByName(String name);

	User findByMemberId(String memberId);
}
