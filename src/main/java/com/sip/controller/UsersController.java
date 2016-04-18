package com.sip.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sip.dao.UserDao;
import com.sip.dao.UserDaoImpl;
import com.sip.model.User;

@Controller
public class UsersController {
	
	private EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("shop");
	private EntityManager entitymanager = emfactory.createEntityManager();
	private UserDao userDao = new UserDaoImpl(entitymanager);

	@RequestMapping(value = "/createuser.html", method = RequestMethod.POST)
	@ResponseBody
	public ModelAndView createUser(@RequestParam String userName, @RequestParam String userEmail)
	{
		System.out.println(userName);
		System.out.println(userEmail);
		
		User user = new User(userName, userEmail);
		userDao.create(user);
		
		// Check a user in the database
		User userDb = userDao.find(user.getUserId());
		
		ModelAndView modelAndView = new ModelAndView("userDetails");
		modelAndView.addObject("user", userDb);
		return modelAndView;
	}
	
	@RequestMapping(value = "/finduser.html", method = RequestMethod.POST)
	@ResponseBody
	public ModelAndView findUser(@RequestParam String userId)
	{
		int id = Integer.parseInt(userId);
		User user = userDao.find(id);
		
		ModelAndView modelAndView = new ModelAndView("userDetails");
		modelAndView.addObject("user", user);
		return modelAndView;
	}
	
	@RequestMapping(value = "/deleteuser.html", method = RequestMethod.POST)
	@ResponseBody
	public void deleteUser(@RequestParam String userId)
	{
		int id = Integer.parseInt(userId);
		userDao.delete(id);
	}
	
	@RequestMapping(value = "/updateuser.html", method = RequestMethod.POST)
	@ResponseBody
	public ModelAndView updateUser(@RequestParam String userId, @RequestParam String userName, @RequestParam String userEmail)
	{
		int id = Integer.parseInt(userId);
		User user = userDao.find(id);

		user.setName(userName);
		user.setEmail(userEmail);
		
		// Update a user
		userDao.update(user);
		
		// Check a user in the database
		User userDb = userDao.find(user.getUserId());
		
		ModelAndView modelAndView = new ModelAndView("userDetails");
		modelAndView.addObject("user", userDb);
		return modelAndView;
	}
}
