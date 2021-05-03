package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Component;

//@RestController
@Component
public class PersonInfoController {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    //@RequestMapping(value = "/getDate")
    public Object get() {
        String sql = "select * from public.\"TEST\"";
        return jdbcTemplate.queryForList(sql);

    }

    //@RequestMapping(value = "/delete")
    public Object delete(int id) {
        String sql = "DELETE FROM test008	WHERE id=?";
        jdbcTemplate.update(sql, id);
        return "删除成功！";
    }

    //@RequestMapping(value = "/update")
    public Object update(int id, String name) {
        String sql = "UPDATE test008	SET name=? 	WHERE id=?";
        System.err.println("delete");
        jdbcTemplate.update(sql, name, id);
        return "更新成功！";
    }

    //@RequestMapping(value = "/add")
    public Object add(String name, int id) {
        String sql = "INSERT INTO public.\"TEST\"(id, name) VALUES (?, ?);";
        jdbcTemplate.update(sql, id, name);
        return "新增成功";

    }

    //@RequestMapping(value = "/get")
    public Object getPerson(int id) {
        String sql = "select * from test008 where id=?";
        return jdbcTemplate.queryForMap(sql, id);

    }

    //@RequestMapping(value = "/count")
    public Integer count() {
        String sql = "SELECT count(name) 	FROM test008  ;";
        Integer k = jdbcTemplate.queryForObject(sql, Integer.class);
        return k;
    }

}
