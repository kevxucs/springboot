package com.example.demo;


import com.example.demo.action.PersonAction;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AnnotationTest {
    // @Autowired
    // PersonAction personAction;
    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("appxml.xml");
        PersonAction personAction = (PersonAction) applicationContext.getBean("personAction");
        personAction.add();
        ((ClassPathXmlApplicationContext) applicationContext).close();
    }
}
