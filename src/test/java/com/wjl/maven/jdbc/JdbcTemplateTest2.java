package com.wjl.maven.jdbc;

import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

import com.mchange.v2.c3p0.ComboPooledDataSource;


public class JdbcTemplateTest2 {
	@Test
	public void test1() throws Exception{
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		dataSource.setDriverClass("com.mysql.jdbc.Driver");
		dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/course3");
		dataSource.setUser("root");
		dataSource.setPassword("123");
		//����JDBCģ��
		JdbcTemplate template = new JdbcTemplate(dataSource);
		template.update("insert into role(rid,name,alias) values(?,?,?)",3,"vistor","guest");
		
	}
}
