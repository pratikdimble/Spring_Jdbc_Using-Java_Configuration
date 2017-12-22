package com.app.test;

import java.sql.DriverManager;

import javax.sql.DataSource;

//package com.app.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class JavaConfig {
	
@Bean
	public DataSource dsObj()
	{
		DriverManagerDataSource dm=new DriverManagerDataSource();
		//set the database properties
			dm.setDriverClassName("oracle.jdbc.OracleDriver");
				dm.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
					dm.setUsername("system");
						dm.setPassword("oracle");
	return dm;
	}

@Bean
	public JdbcTemplate jtObj()
	{
		JdbcTemplate jt=new JdbcTemplate();
		 	jt.setDataSource(dsObj());
		return jt;
	
	}
}
