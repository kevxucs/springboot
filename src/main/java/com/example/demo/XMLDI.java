package com.example.demo;

import com.example.demo.bean.Customer;

import org.springframework.context.ApplicationContext; 
import org.springframework.context.support.ClassPathXmlApplicationContext; 

public class XMLDI { 
    public static void main(String[] args) { 
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Customer customerBean = (Customer) context.getBean("customerBean"); 
        customerBean.displayInfo(); 

        ((ClassPathXmlApplicationContext) context).close();
    } 
}
