package com.bank.entity;
import org.springframework.stereotype.Component;

@Component
public class BankService {
	
	public void deposit(double amount) {
		System.out.println(amount + "rs" +  " Deposited to your account");
		
	}
	
	public void withdraw(double amount) {
		System.out.println("The amount withdraw from your account : " + amount + "rs");
		
	}
    
}
