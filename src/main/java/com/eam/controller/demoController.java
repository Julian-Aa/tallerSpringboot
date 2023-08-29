package com.eam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eam.repository.IAUserRepository;
import com.eam.models.*;

@Controller
@RequestMapping("/user")
public class demoController {

	@Autowired
	private IAUserRepository usuarioRepository;
	
	@GetMapping("/users")
	public String listUsers(Model model) {
		List<User> usuarios = usuarioRepository.findAll();
		model.addAttribute("usuarios",usuarios);
		return "user-list";
	}

	
}
