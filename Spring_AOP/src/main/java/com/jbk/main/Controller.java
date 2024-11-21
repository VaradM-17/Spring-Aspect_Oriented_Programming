package com.jbk.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jbk.config.SpringConfigureFile;
import com.jbk.entity.Account;

public class Controller {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigureFile.class);

		Account a = context.getBean(Account.class);
//		a.deposit();
		a.recharge();
	}

}
