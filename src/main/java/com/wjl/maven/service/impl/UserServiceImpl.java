package com.wjl.maven.service.impl;

import com.wjl.maven.service.IUserService;

public class UserServiceImpl implements IUserService {

	@Override
	public void save() {
		System.out.println("+++++++++++++保存用户++++++++++");

	}

	@Override
	public void delete() {
		System.out.println("+++++++++++++删除用户++++++++++");

	}

}
