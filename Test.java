package com.sfmi.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.sfmi.beans.Reminder;

public class Test {

	public static void main(String[] args) {

		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("com/sfmi/common/application-context.xml"));
		
		Reminder reminder=factory.getBean("reminder",Reminder.class);
		
		System.out.println(reminder.getReminder());
	}

}
