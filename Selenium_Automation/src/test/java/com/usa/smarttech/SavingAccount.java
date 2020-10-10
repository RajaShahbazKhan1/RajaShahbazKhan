package com.usa.smarttech;

	public class SavingAccount {

	static String name;
	static double Initialbalance;
	static double deposit;
	static double withdraw;
	static double blance;

	@SuppressWarnings("unused")
	protected void openAccount() {
	name = " Raja Shahbaz ";
	int id = 1801;
	int accounNumber = 45891573;
	String address = " 2842 Brigham Street Brooklyn NY";
	String Customer = name + " Customer ID :" + id + " Customer address :" + address + " Account number : "
	+ accounNumber;
	System.out.println(" Customer name : " + name);
	System.out.println(" Customer account num : " + accounNumber);
	}

	protected void sevingDetails() {
	Initialbalance = 1500.99;
	deposit = 97000;
	withdraw = 7000.75;
	blance = Initialbalance + deposit - withdraw;
	System.out.println("Customer total savings : " + blance);
	}



	}
	

	
		
	
	
	
	
	
	
	
	
	
	
	
	
 

