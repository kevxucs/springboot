package com.example.demo.action;

import com.example.demo.Service.PersonService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("personAction")
public class PersonAction {
    @Autowired
    private PersonService personService;
    public PersonService getPersonService() {
        return personService;
    }
    public void add() {
        personService.add(); 
        System.out.println("Action's add() started...");
    }
}
