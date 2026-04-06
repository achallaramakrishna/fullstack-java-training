package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {
	
	@RequestMapping("/form")
	public String showForm() {
		
		return "form";
	}
	
	
    @RequestMapping("/submitForm")
    public String handleForm(@RequestParam("studentName") String name, Model model) {
        model.addAttribute("message", "Hello " + name);
        return "result";
    }
	
	

}









