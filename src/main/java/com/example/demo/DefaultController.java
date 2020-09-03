package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DefaultController {
    @GetMapping
    public String Default(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "default";
    }
    @GetMapping("/index")
    public String getIndex(){
        return "index";
    }
    @GetMapping("/about")
    public String getAbout(){
        return "about";
    }
    @GetMapping("/party")
    public String getParty(){
        return "party";
    }
    @GetMapping("/contact")
    public String getContact(){
        return "contact";
    }
}
