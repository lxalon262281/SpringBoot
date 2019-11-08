package com.lx.jpaTest.controller;

import com.lx.jpaTest.dao.DbUserRepository;
import com.lx.jpaTest.entity.DbUser;
import com.lx.jpaTest.entity.Person;
import com.lx.jpaTest.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HelloController {
	@Autowired
	PersonService personService;

	@Autowired
	DbUserRepository dbUserRepository;

	@RequestMapping("/hello2")
	public String hello(String name){
		Person person = personService.getPerson(name);
		System.out.println(person.getName());
		return "hello";
	}

	@RequestMapping("/getDbUser")
	public String getDbUser(String name){
		DbUser user = dbUserRepository.findByUsername(name);
		System.out.println(user.getUsername());
		return "hello";
	}


	@Secured("ROLE_USER")
	@RequestMapping("/hello")
	//@PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_USER')")
	public String hello(){
		return "hello";
	}

	@RequestMapping(value = "/login")
	public String login() {
		return "login";
	}

	@RequestMapping(value = "/logout")
	public String logout() {
		return "home";
	}

	@RequestMapping(value = "/denied")
	public String denied() {
		return "denied";
	}

	@Secured("ROLE_ADMIN")
	@RequestMapping(value = "/admin")
	//@PreAuthorize("hasAnyRole('ROLE_ADMIN')")
	public String admin() {
		return "admin";
	}
}

