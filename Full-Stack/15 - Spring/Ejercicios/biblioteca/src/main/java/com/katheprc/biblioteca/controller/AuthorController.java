package com.katheprc.biblioteca.controller;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.katheprc.biblioteca.exceptions.MyException;
import com.katheprc.biblioteca.service.LibraryService;

@Controller
@RequestMapping("/author")
public class AuthorController {

	@Autowired
	private LibraryService LService;

	@GetMapping("/")
	public String SignUp() {
		return "author_form.html";
	}

	@PostMapping("/SignUp")
	public String SignUp(@RequestParam String name) {

		try {
			LService.createAuthor(name);
		} catch (MyException e) {
			Logger.getLogger(AuthorController.class.getName()).log(Level.SEVERE, null, e);
			return "author_form.html";
		}
		return "index.html";
		

	}
}
