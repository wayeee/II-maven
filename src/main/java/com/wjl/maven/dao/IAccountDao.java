package com.wjl.maven.dao;

public interface IAccountDao {

	//º”«Æ
	void increaseMoney(Integer id, Double money);
	
	//ºı«Æ
	void decreaseMoney(Integer id, Double money);
}
