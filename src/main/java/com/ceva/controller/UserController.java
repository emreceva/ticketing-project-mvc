package com.ceva.controller;

import com.ceva.dto.UserDTO;
import com.ceva.service.RoleService;
import com.ceva.service.UserService;
import com.ceva.service.impl.RoleServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    RoleService roleService;
    UserService userService;

    public UserController(RoleService roleService, UserService userService) {
        this.roleService = roleService;
        this.userService = userService;
    }

    @GetMapping("/create")
    public String createUser(Model model){


        model.addAttribute("user", new UserDTO());
        model.addAttribute("roles",roleService.findAll());
        model.addAttribute("users",userService.findAll());



        return "/user/create";
    }
    @PostMapping("/create")
    public String insertUser(@ModelAttribute("user") UserDTO user, Model model){

        userService.save(user);

        return "redirect:/user/create";

    }

}
