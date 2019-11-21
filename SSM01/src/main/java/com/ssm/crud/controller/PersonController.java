package com.ssm.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ssm.crud.mapper.PersonMapper;
import com.ssm.crud.pojo.Person;

@Controller
public class PersonController {

	@Autowired
	PersonMapper personMapper;
	@RequestMapping("/person")
	public ModelAndView personHandler(@RequestParam("id")Integer id) {
		System.out.println("123");
		ModelAndView modelAndView = new ModelAndView();
		Person person = personMapper.getPersonById(id);
		modelAndView.addObject("person", person);
		modelAndView.setViewName("success");
		return modelAndView;
	}
}
