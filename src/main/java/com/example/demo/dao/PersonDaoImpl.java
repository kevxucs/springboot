package com.example.demo.dao;

import org.springframework.stereotype.Repository;
@Repository("personDao")
public class PersonDaoImpl implements PersonDao {
    @Override
    public void add() {
        System.out.println("Dao's add() started...");
    }
}
