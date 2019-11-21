package com.ssm.crud.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ssm.crud.mapper.PersonMapper;
import com.ssm.crud.pojo.Person;

public class Test {
	
	static ApplicationContext iocApplicationContext = new ClassPathXmlApplicationContext("springioc.xml");
	public static void main(String[] args) {
		PersonMapper bean = iocApplicationContext.getBean(PersonMapper.class);
		System.out.println(bean);
		Person personById = bean.getPersonById(1);
		System.out.println(personById);
	}
	
}
