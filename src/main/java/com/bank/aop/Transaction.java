package com.bank.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

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

    
    @AfterReturning(
        pointcut = "execution(* com.bank.entity.BankService.deposit(..))",
        returning = "amount"
    )
    public void afterDepositSuccess(double amount) {
        System.out.println("Successfully deposited " + amount + "rs");
    }


    
    @Around("execution(* com.bank.entity.BankService.withdraw(..))")
    public Object aroundWithdraw(ProceedingJoinPoint projp) throws Throwable {
        System.out.println("Checking withdrawal conditions");
        Object result = projp.proceed();  
        System.out.println("Withdrawal completed.");
        return result;
    }
}
