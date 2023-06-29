package org.sjcem.objects;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//program to demonstrate on DI in the form of objects
public class DIUsingObjectsExecutor {

	public static void main(String[] args) {
		ApplicationContext a = new ClassPathXmlApplicationContext("objects.xml");
		Student s1 = (Student) a.getBean("s1");
		s1.print();
	}

}
