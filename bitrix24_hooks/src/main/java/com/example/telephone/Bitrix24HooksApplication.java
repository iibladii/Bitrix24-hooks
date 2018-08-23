package com.example.telephone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Bitrix24HooksApplication {

	public static void main(String[] args) {
		ApplicationContext aap = new AnnotationConfigApplicationContext(myConfig.class);
		InputHooks ih = aap.getBean("Hook",InputHooks.class);
		//Вызываем входящий хук
		try {
			ih.testUse();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Слушаем исходящий хук
		SpringApplication.run(Bitrix24HooksApplication.class, args);
	}
}
