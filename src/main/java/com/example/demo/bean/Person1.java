package com.example.demo.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;



@Component
public class Person1 {
 
    @Value("Tom")
    private String name;

    @Value("#{12*2}")
    private Integer age;

    @Value("true")
    private Boolean sex;

    @Value("${person.birth}")
    private Date birth;

    @Override
    public String toString() {
        return "Person1 [age=" + age + ", birth=" + birth + ", name=" + name + ", sex=" + sex + "]";
    }

}
