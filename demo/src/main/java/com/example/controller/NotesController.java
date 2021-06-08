package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class NotesController {
	
	@RequestMapping("/getNotes")
	@ResponseBody
	public void displayNotes() {
		System.out.println("Inside Controller*******");
		//return "notes";
	}

}
