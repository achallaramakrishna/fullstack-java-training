package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


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
	    
	    // MODEL
	    @GetMapping("/model")
	    public String usingModel(Model model) {
	        model.addAttribute("message", "Hello from Model");
	        return "model";
	    }

	    // MODEL MAP
	    @GetMapping("/modelmap")
	    public String usingModelMap(ModelMap modelMap) {
	        modelMap.addAttribute("message", "Hello from ModelMap");
	        return "modelmap";
	    }

	    // MODEL AND VIEW
	    @GetMapping("/modelandview")
	    public ModelAndView usingModelAndView() {
	        ModelAndView mv = new ModelAndView();
	        mv.addObject("message", "Hello from ModelAndView");
	        mv.setViewName("modelandview");
	        return mv;
	    }
}
