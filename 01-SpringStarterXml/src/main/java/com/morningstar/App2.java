package com.morningstar;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.morningstar.model.Student;

public class App2 {
	public static void main( String[] args )
    {
        //step1: get the handle of spring container
    	BeanFactory factory=new ClassPathXmlApplicationContext("spring-config.xml");
    	
    	//step2:will ask for student object for spring container
//    	Student student=(Student) factory.getBean("student");
    	Student student=factory.getBean("student2", Student.class);
    	Student student1=factory.getBean("student2", Student.class);
//    	Student student=factory.getBean(Student.class);
    	
    	//step3:use student object
    	System.out.println(student.hashCode());
    	System.out.println(student1.hashCode());
    	
    	System.out.println("-----------------");
    	
    	Student student2=factory.getBean("student", Student.class);
    	Student student3=factory.getBean("student", Student.class);
    	
    	System.out.println(student2.hashCode());
    	System.out.println(student3.hashCode());
    	
    	
    	
    	
    }
}
