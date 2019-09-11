package com.springmvcone;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class LoginDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<User> findAll() {
		String query = "SELECT * FROM USERS";
		return jdbcTemplate.query(query, new BeanPropertyRowMapper<User>(User.class));
	}
}
