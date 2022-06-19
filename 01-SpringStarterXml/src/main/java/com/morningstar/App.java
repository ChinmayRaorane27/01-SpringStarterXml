package com.morningstar;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.morningstar.model.Student;

public class App {
	public static void main( String[] args )
    {
        //step1: get the handle of spring container
    	BeanFactory factory=new ClassPathXmlApplicationContext("spring-config.xml");
    	
    	//step2:will ask for student object for spring container
//    	Student student=(Student) factory.getBean("student");
//    	Student student=factory.getBean("student", Student.class);
    	Student student=factory.getBean(Student.class);
    	
    	
    	//step3:use student object
    	System.out.println(student);
    	System.out.println(student);
    	
    	
    	
    	
    	
    	
    }
}
