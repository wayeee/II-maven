package com.wjl.maven.dao;

public interface IAccountDao {

	//��Ǯ
	void increaseMoney(Integer id, Double money);
	
	//��Ǯ
	void decreaseMoney(Integer id, Double money);
}
