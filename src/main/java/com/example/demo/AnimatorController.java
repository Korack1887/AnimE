package com.example.demo;


import com.example.demo.DAO.IMyDAO;
import com.example.demo.Entity.Costume;
import com.example.demo.Entity.Animator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.sql.SQLException;
import java.util.List;


@Controller
public class AnimatorController {
    @Autowired
    public IMyDAO iMyDAO;

    @GetMapping("/animatorsUser")
    public String getAllAnimatorUser(Model model){
        model.addAttribute("animators",iMyDAO.getAllAnimator());
        return "animatorsUser";
    }
    @GetMapping("/animatorsAdmin")
    public String getAllAnimatorAdmin(Model model){
        model.addAttribute("animators",iMyDAO.getAllAnimator());
        return "animatorsAdmin";
    }
    @GetMapping("/createAnimator")
    public  String createAnimator(Model model){
        List<Costume> costumes  = iMyDAO.getAllCostume();
        model.addAttribute("costumes", costumes);
        return "createAnimator";
    }
    @PostMapping("/createAnimator")
    public  String createAnimator(@ModelAttribute("Animator") Animator animator ) throws SQLException {
        iMyDAO.insertAnimator(animator);
        return "redirect:/animatorsAdmin";
    }
    @GetMapping("/animators")
    public String getIndex(Model model){
        return "animators";
    }
}
