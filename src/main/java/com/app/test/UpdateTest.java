package com.app.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class UpdateTest {

	public static void main(String[] args) {
		//read and print the employee i.e parent object
		AnnotationConfigApplicationContext c=new 
				AnnotationConfigApplicationContext(JavaConfig.class);
						JdbcTemplate jt=(JdbcTemplate)c.getBean("jtObj");
				
				String sql="UPDATE EMPLOYEE SET NAME=?,SALARY=? WHERE ID=?";
				
				int count=jt.update(sql,"SHUBHAM",16.78f,11);
				
				System.out.println(count+" Rows Updated");
				

	}

}
