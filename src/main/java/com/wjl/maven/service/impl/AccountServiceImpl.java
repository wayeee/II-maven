package com.wjl.maven.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wjl.maven.dao.IAccountDao;
import com.wjl.maven.service.IAccountService;

@Service
public class AccountServiceImpl implements IAccountService {
	@Autowired
	private IAccountDao accountDao;

	//如果添加@Transactional，那么当前方法叫做事务方法
	@Transactional
	@Override
	public void transfer(Integer from, Integer to, Double money) {
		
		accountDao.decreaseMoney(from, money);
		/*Integer.parseInt("abc");*/
		accountDao.increaseMoney(to, money);

	}

}
