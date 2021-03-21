package com.example.demo.Service;


import com.example.demo.dao.PersonDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service("personService")
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonDao personDao;
    public PersonDao getPersonDao() {
        return personDao;
    }
    @Override
    public void add() {
        personDao.add();
        System.out.println("Service's add() started'...");
    }
}
