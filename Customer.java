package org.antwalk;

import org.antwalk.interfaces.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class Customer {
	
	public String name;
	public String username;
	public String pass;
	public int  age;
	public String SSN;
	public String addr;
	public String mail;
	public long phone;
	public  float balance;
	
	
	
	
	 public void Cust() {
		
		this.name = "ruma";
		this.username = "1224";
		this.pass = "23333";
		this.age = 23;
		this.SSN = "99";
		this.addr = "puli";
		this.mail = "mail.com";
		this.phone = 89999;
		this.balance = 234;
	//	System.out.println("i m here");
	}
	 
	 
	 
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}



	@Autowired
	 @Qualifier("curr")
      Account act;
	// public static void main(String[] args) { 
	public void showing() {
		String str = act.showAccount();
		System.out.println("I am customer with  name : "+  this.name + "\n" + "username : " +this.username+ "\n"+"password:  "+ 
		this.pass+"\n"+   "age:  " +  this.age+"\n"+  "ssn : "+ this.SSN+"\n"+ "address: "+ this.addr +"  email"+ 
		this.mail + "  phone  :"+this.phone + "  balance:"+ this.balance + "  account :"+str);
		//System.out.println(this.name);
	 }
  // System.out.println(act.showAccount());
	

}
