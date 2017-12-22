package com.app.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext c=new 
								AnnotationConfigApplicationContext(JavaConfig.class);
		JdbcTemplate jt=(JdbcTemplate)c.getBean("jtObj");
		System.out.println(jt);
	}

}
