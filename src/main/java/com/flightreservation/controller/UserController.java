package com.flightreservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.flightreservation.entity.Persion;
import com.flightreservation.repository.UserRepository;

@Controller
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@RequestMapping("/showRegister")
	public String showRegistrationPage() {

		return "registerUser";
	}

	@RequestMapping("/registerUser")
	public String register(@ModelAttribute("user") Persion user) {
		userRepository.save(user);

		return "login";
	}

	@RequestMapping("/login") 
	public String login(@RequestParam("email") String email, @RequestParam("password") String password,
			ModelMap modelMap) {

		System.out.println("hiiii");
		Persion user = userRepository.findByEmail(email);
		System.out.println(user);

		if (user.getPassword().equals(password)) {
			return "findFlight";
		} else {
			modelMap.addAttribute("msg", "Invalid user name and password . please try again.");
		}
		return "login";

	}

}
