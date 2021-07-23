package com.sathya.krishna;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Employee e=context.getBean("obj",Employee.class);
        System.out.println(e.getEno()+""+e.getEname()+""+e.getDesignation());
    }
}
