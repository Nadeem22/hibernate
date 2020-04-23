package com.jcoder.database.jdbc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import com.jcoder.database.jdbc.dao.PersonDao;

@SpringBootApplication
public class JdbcApplication implements CommandLineRunner {
	private Logger logger=LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private PersonDao personDao;

	public static void main(String[] args) {
		SpringApplication.run(JdbcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
				logger.info("persons details : {}", personDao.findAll());
	}

}
