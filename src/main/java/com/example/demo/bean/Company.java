package com.example.demo.bean;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "company")
public class Company {
    private String name;
    private List<Person> employee;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public List<Person> getEmployee() {
        return employee;
    }

    public void setEmployee(List<Person> employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Company [employee=" + employee + ", name=" + name + "]";
    }

}
