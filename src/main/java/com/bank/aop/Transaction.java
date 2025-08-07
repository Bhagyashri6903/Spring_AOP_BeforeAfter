package com.bank.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.After;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Transaction {
	
	@Before("execution(* com.bank.entity.BankService.*(..))")
	public void beforeTransaction() {
		System.out.println("Transaction will begin");
	}
	
	@After("execution(* com.bank.entity.BankService.*(..))")
	public void afterTransaction() {
		System.out.println("The transaction is completed");
	}

}
