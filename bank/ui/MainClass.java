package com.bank.ui;
import com.bank.beans.Signing;
import com.bank.service.*;
import java.util.Scanner;

public class MainClass {
	static Scanner sc =  new Scanner(System.in);
	static ISignService service = new SignServiceImpl();

	public static Signing setInfo() throws Exception{
		Signing entry  = new Signing();
		System.out.println("Enter First Name");
		entry.setFirstName(sc.next());
		System.out.println("Enter the last Name");
		entry.setLastName(sc.next());
		System.out.println("Enter the email id");
		entry.setEmailId(sc.next());
		System.out.println("Enter the password for account");
		entry.setPassword(sc.next());
		System.out.println("Enter the pan card number");
		entry.setPanCard(sc.next());
		System.out.println("Enter the aadhar card number");
		entry.setAadharNo(sc.nextLong());
		System.out.println("Enter the address");
		entry.setAddress(sc.next());
		System.out.println("Enter the mobile number");
		entry.setMobileNo(sc.nextLong());
		
		entry.setBalance(0);

		Signing reg = service.registration(entry);
		return reg;
	}
	
	
	
	public static void main(String[] args) throws Exception {
		int choose;
			
		Signing obj1 =  null;
		while(true) {
		System.out.println("Enter \n1.Registration \n2.Login \n3.Exit");	
		choose = sc.nextInt();
		switch(choose) {
		
		case 1:		obj1  = setInfo();
						System.out.println("Your account number is "+obj1.getAccountNo());
						break;
		
		case 2:		Signing obj2 = service.login(obj1);	
						break;
		
		case 3:   System.exit(0);				
			
		}
		}
	}

}
