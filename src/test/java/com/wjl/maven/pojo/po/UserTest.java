package com.wjl.maven.pojo.po;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wjl.maven.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-aop-test2.xml"})
public class UserTest {

	@Autowired
	private IUserService userService;
	
	@Test
	public void test1(){
		
		userService.save();
	}
}
