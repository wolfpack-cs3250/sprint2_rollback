package com.banner.bannerApplication.controllers;

/*
*   Here will lie all of the CRUD operations for Sprint2
*   - Sal
*
*/

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.banner.bannerApplication.entities.User;
import com.banner.bannerApplication.repositories.UserRepository;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("userpage")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping(path="/add")
    public String addNewUser (@RequestParam String firstname,
                                            @RequestParam String lastname) {
        User n = new User();
        n.setFirstName(firstname);
        n.setLastName(lastname);
        userRepository.save(n);
        return "index";
    }

    @GetMapping(path="")
    public String showall(Model model) {
        Iterable<User> allusers = userRepository.findAll();
        model.addAttribute("allusers", allusers);
        return "userpage";
    }

}
