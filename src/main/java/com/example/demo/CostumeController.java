package com.example.demo;


import com.example.demo.DAO.IMyDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class CostumeController {
    @Autowired
    public IMyDAO iMyDAO;

    @GetMapping("/costumesUser")
    public String getAllCostumeUser(Model model){
        model.addAttribute("costumes",iMyDAO.getAllCostume());
        return "costumesUser";
    }
    @GetMapping("/costumesAdmin")
    public String getAllCostumeAdmin(Model model){
        model.addAttribute("costumes",iMyDAO.getAllCostume());
        return "costumesAdmin";
    }
    @GetMapping("/costume")
    public String getIndex(Model model){
        return "costume";
    }
}
