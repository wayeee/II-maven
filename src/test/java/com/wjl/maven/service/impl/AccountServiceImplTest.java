package com.wjl.maven.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wjl.maven.service.IAccountService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-jdbc-annotation2.xml"})
public class AccountServiceImplTest {

	@Autowired
	private IAccountService aService;
	
	@Test
	public void testTransfer(){
		aService.transfer(1, 2, 100.0);
	}
}
