package com.app.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;


public class DeleteTest {

	public static void main(String[] args) {
		//read and print the employee i.e parent object
		AnnotationConfigApplicationContext c=new 
				AnnotationConfigApplicationContext(JavaConfig.class);
						JdbcTemplate jt=(JdbcTemplate)c.getBean("jtObj");
				
				String sql="DELETE FROM EMPLOYEE WHERE ID=?";
				
				int count=jt.update(sql, 11);
				
				System.out.println(count+" Rows Deleted");
				

	}

}
