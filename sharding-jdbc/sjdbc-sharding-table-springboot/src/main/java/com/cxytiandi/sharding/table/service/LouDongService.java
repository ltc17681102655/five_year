package com.cxytiandi.sharding.table.service;

import java.util.List;

import com.cxytiandi.sharding.table.po.LouDong;

public interface LouDongService {

	List<LouDong> list();
	
	Long addLouDong(LouDong louDong);
		
}
