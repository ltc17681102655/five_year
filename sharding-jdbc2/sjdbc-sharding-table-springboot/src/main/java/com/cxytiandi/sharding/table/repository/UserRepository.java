package com.cxytiandi.sharding.table.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cxytiandi.sharding.table.po.User;


@Mapper
public interface UserRepository {
	
	Long addUser(User user);
	
	List<User> list();
	
	User findById(Long id);
	
	User findByName(String name);

    User findByMemberId(String memberId);
}
