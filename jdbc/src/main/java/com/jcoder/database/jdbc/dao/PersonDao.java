package com.jcoder.database.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.jcoder.database.jdbc.entity.Person;

@Repository   //  defines that it will talks to database
public class PersonDao {
	@Autowired
	JdbcTemplate jdbcTemplete; // provided by spring to perform jdbc operations 
	
	
	public List<Person> findAll(){
		return jdbcTemplete.query("select * from person",new BeanPropertyRowMapper<Person>(Person.class)); //BeanPropertyRowMapper<Person>(Person.class) maps the result to the person object
		
	}

}
