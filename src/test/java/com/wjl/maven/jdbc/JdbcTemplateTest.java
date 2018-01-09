package com.wjl.maven.jdbc;

import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

import com.mchange.v2.c3p0.ComboPooledDataSource;


public class JdbcTemplateTest {
	@Test
	public void test1() throws Exception{
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		dataSource.setDriverClass("com.mysql.jdbc.Driver");
		dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/course3");
		dataSource.setUser("root");
		dataSource.setPassword("123");
		//„“½¨JDBCÄ£°å
		JdbcTemplate template = new JdbcTemplate(dataSource);
		template.update("insert into student values(?,?)",3,"guest");
		
	}
}
