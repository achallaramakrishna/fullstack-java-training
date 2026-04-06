package com.example.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.model.User;
import com.example.service.UserService;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public String listUsers(Model model) {
        model.addAttribute("users", userService.getAllUsers());
        return "users/list-users";
    }

    @GetMapping("/users/add")
    public String showAddForm(Model model) {
        model.addAttribute("user", new User());
        model.addAttribute("pageTitle", "Add User");
        model.addAttribute("formAction", "save");
        return "users/user-form";
    }

    @PostMapping("/users/save")
    public String saveUser(@Valid @ModelAttribute("user") User user,
                           BindingResult result,
                           Model model) {
        if (result.hasErrors()) {
            model.addAttribute("pageTitle", "Add User");
            model.addAttribute("formAction", "save");
            return "users/user-form";
        }

        userService.saveUser(user);
        return "redirect:/users";
    }

    @GetMapping("/users/edit")
    public String showEditForm(@RequestParam("id") Integer id, Model model) {
        User user = userService.getUserById(id);
        if (user == null) {
            return "redirect:/users";
        }

        model.addAttribute("user", user);
        model.addAttribute("pageTitle", "Edit User");
        model.addAttribute("formAction", "update");
        return "users/user-form";
    }

    @PostMapping("/users/update")
    public String updateUser(@Valid @ModelAttribute("user") User user,
                             BindingResult result,
                             Model model) {
        if (result.hasErrors()) {
            model.addAttribute("pageTitle", "Edit User");
            model.addAttribute("formAction", "update");
            return "users/user-form";
        }

        userService.updateUser(user);
        return "redirect:/users";
    }

    @GetMapping("/users/delete")
    public String deleteUser(@RequestParam("id") Integer id) {
        userService.deleteUser(id);
        return "redirect:/users";
    }
}