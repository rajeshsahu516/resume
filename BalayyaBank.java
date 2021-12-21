package com.technoelevate;

import org.apache.log4j.Logger;

public class BalayyaBank {
	private String name;
	private double bal;
	private String UserName;
	private String password;
	
	
	static Logger logger = Logger.getLogger(BalayyaBank.class.getName());
	public BalayyaBank(String name, double bal, String userName, String password) {
		super();
		this.name = name;
		this.bal = bal;
		UserName = userName;
		this.password = password;
	}
	public double deposit(String UserName,String password, double amount)  {
		if(!this.name.equals(UserName) && !this.name.equals(password)) {
			logger.fatal("\"enter into try block in withdraw methods\"");
			System.out.println("Invalid Credients");
		}
		else {
			this.bal +=amount;
			System.out.println("INR"+ amount +"has been deposited.Total bal available is :" + this.bal);
		}
		return bal;
		
	}
	public void withdraw(String UserName,String password,double amount)  {
		try {
		
		
		
		if(!this.name.equals(UserName) && !this.password.equals(password)) {
			logger.fatal("\"enter into try block in withdraw methods\"");
		}
		else {
			if(this.bal< amount) {
				System.out.println("mr" + this.name +"you are not having enough money in your acc");
			} else {
				this.bal -= amount;
				System.out.println("you have total balance of rupees :"+ this.bal);
				
			}
	}}
		catch(Exception e) {
			logger.warn("from catch exception in withdraw method");
		}
		finally {
			  System.out.println("from catch exception in withdraw method");
			System.out.println("from finally blk");
			
		}
		}
	public String getName() {
		return name;
	}
	public double getBal() {
		return bal;
	}
	public String getUserName() {
		return UserName;
	}
	public String getPassword() {
		return password;
	}

}
