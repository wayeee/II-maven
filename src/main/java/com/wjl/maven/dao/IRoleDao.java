package com.wjl.maven.dao;

import com.wjl.maven.pojo.po.Role;

public interface IRoleDao {

	//Ôö
	void save(Role role);
	
	//É¾
	void delete(Integer id);
	
	//¸Ä
	void update(Role role);
	
	//²é
	void getById(Integer id);
	
}
