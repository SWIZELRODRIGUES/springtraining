package com.springmvcone;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("loginService")
public class LoginService {

	@Autowired
	private LoginDAO loginDao;

	public boolean check(String login, String password) {
		List<User> users = loginDao.findAll();
		int flag = 0;

		for (User user : users) {
			if (login.equals(user.getName()) && password.equals(user.getPassword()))
				return true;
		}
		return false;
	}
}
