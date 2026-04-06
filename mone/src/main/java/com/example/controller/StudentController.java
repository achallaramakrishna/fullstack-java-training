package com.example.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.model.Student;

@Controller
public class StudentController {

    @GetMapping("/studentForm")
    public String showForm(Model model) {
        model.addAttribute("student", new Student());
        return "student-form";
    }

    @PostMapping("/saveStudent")
    public String saveStudent(@Valid @ModelAttribute("student") Student student,
                              BindingResult result,
                              Model model) {

        if (result.hasErrors()) {
            return "student-form";
        }

        model.addAttribute("message", "Student saved successfully");
        model.addAttribute("student", student);

        return "student-result";
    }
}