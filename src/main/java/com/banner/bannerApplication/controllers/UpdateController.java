package com.banner.bannerApplication.controllers;

import com.banner.bannerApplication.entities.User;
import com.banner.bannerApplication.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

@Controller
@RequestMapping("update")
public class UpdateController {
    @Autowired
    private UserRepository updateRepository;
    @Autowired
    private EntityManager entityManager;

    @GetMapping(path="")
    public @ResponseBody String updateUser(@RequestParam String id, @RequestParam String firstname, @RequestParam String lastname){
        return "test";
//        User n= new User();
//        n=updateRepository.findOne(id);
//        n.setFirstName(firstname);
//        n.setLastName(lastname);
//        entityManager.merge(n);
//        return "Updated";
                }

                }