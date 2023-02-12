package org.antwalk;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//import org.springframework.beans.factory.annotation.Autowired;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Appconfig.class);
		Customer cs = ctx.getBean(Customer.class);
		cs.Cust();
	
		cs.showing();
  
	}

}
