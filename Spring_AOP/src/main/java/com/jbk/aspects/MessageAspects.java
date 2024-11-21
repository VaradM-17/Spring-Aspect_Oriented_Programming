package com.jbk.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MessageAspects {

//	@Before("execution(public void deposit())")
//	public void sendMessageOne()
//	{
//		System.out.println("Enter Your Pin .......");
//	}
//	
//	@After("execution(public void deposit())")
//	public void sendMessageTwo()
//	{
//		System.out.println("your amount is deposited");
//	}

	@Around("execution ( * com.jbk.entity.Account.*(..))")
	public void SendSMS(ProceedingJoinPoint p) // set before and after behaviour
	{
		// before
		System.out.println("Dear user your account is deactivated, please.... recharge today !!!");
		try 
		{
			p.proceed();
		} catch (Throwable t) 
		{
			t.printStackTrace();
		}
		// after
		System.out.println("Account activated , Recharge Successfull ");
	}
}
