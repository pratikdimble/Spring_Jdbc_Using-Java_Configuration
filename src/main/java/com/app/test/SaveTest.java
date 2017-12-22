package com.app.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class SaveTest {

	public static void main(String[] args) {
		//read and print the employee i.e parent object
		AnnotationConfigApplicationContext c=new 
				AnnotationConfigApplicationContext(JavaConfig.class);
						JdbcTemplate jt=(JdbcTemplate)c.getBean("jtObj");
				
				String sql="INSERT INTO EMPLOYEE VALUES(?,?,?)";
				
				int count=jt.update(sql, 12,"Shubham",20.21f);
				
				System.out.println(count+" Rows inserted");
				

	}

}
