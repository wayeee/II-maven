package com.wjl.maven.jdbc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wjl.maven.dao.IRoleDao;
import com.wjl.maven.pojo.po.Role;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-jdbc.xml"})
public class JdbcTemplateTest3 {
	
	@Autowired
	private IRoleDao roleDao;
	
	@Test
	public void testSave(){
		Role role = new Role(4,"guest2","╦ъ╤ксн©м");
		roleDao.save(role);
	}
}
