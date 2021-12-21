package com.technoelevate;

public class BalayyaMain {

	public static void main(String[] args) throws InvalidCredentialsException {
     BalayyaBank bb=new BalayyaBank("Rajesh",45000,"Rajesh","Rajesh98");
     

	bb.withdraw ("Rajesh","Rajesh98",234678);
    bb.deposit("Rajesh", "Rajesh98", 10000);
}
	}

