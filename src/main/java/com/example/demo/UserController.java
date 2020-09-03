package com.example.demo;


import com.example.demo.DAO.IMyDAO;
import com.example.demo.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.sql.SQLException;


@Controller
public class UserController {
    @Autowired
    public IMyDAO iMyDAO;

    @GetMapping("/createUser")
    public String getAllUserUser(Model model){
        model.addAttribute("users",iMyDAO.getAllUser());
        return "createUser";
    }
    @PostMapping("/createUser")
    public  String createUser(@ModelAttribute("User") User user ) throws SQLException {
        iMyDAO.insertUser(user);
        return "redirect:/animatorsUser";
    }
    @GetMapping("/usersAdmin")
    public String getAllUserAdmin(Model model){
        model.addAttribute("users",iMyDAO.getAllUser());
        return "usersAdmin";
    }
}
