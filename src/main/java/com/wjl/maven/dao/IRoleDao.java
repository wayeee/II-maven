package com.wjl.maven.dao;

import com.wjl.maven.pojo.po.Role;

public interface IRoleDao {

	//��
	void save(Role role);
	
	//ɾ
	void delete(Integer id);
	
	//��
	void update(Role role);
	
	//��
	void getById(Integer id);
	
}
