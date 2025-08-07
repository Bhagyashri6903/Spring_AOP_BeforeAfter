package com.bank.main;

import com.bank.config.Config;
import com.bank.entity.BankService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	 public static void main(String[] args) {
	        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

	        BankService bankService = context.getBean(BankService.class);

	        bankService.deposit(10000);
	        bankService.withdraw(1500);
	    }
	}