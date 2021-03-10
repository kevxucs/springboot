package com.example.demo;

import com.example.demo.bean.Company;
import com.example.demo.bean.Person;
import com.example.demo.bean.Person1;
import com.example.demo.bean.ReadConfig;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    private Person person;

    @Autowired
    private Person1 person1;

    @Autowired
    private Company company;

    @Autowired
    private ReadConfig config;

    @Test
    public void contextLoads() {
        System.out.println(person);
    }

    @Test
    public void loadsPerson() {
        System.out.println(person1);
    }

    @Test
    public void loadCompany() {
        System.out.println(company);
    }

    @Test
    public void loadReadConfig() {
        System.out.println(config);
    }

    @Autowired
    private ApplicationContext context;

    @Test
    public void TestDog() {
        System.out.println(this.context.containsBean("dog"));
    }

    Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    public void testLogger() {
        logger.trace("trace");
        logger.debug("trace");
        logger.info("trace");
        logger.warn("trace");
        logger.error("trace");
    }
}
