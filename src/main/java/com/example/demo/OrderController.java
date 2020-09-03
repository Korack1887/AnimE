package com.example.demo;


import com.example.demo.DAO.IMyDAO;
import com.example.demo.Entity.Animator;
import com.example.demo.Entity.Costume;
import com.example.demo.Entity.Order;
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
public class OrderController {
    @Autowired
    public IMyDAO iMyDAO;

    @GetMapping("/ordersUser")
    public String getAllOrderUser(Model model){
        model.addAttribute("orders",iMyDAO.getAllOrder());
        return "ordersUser";
    }
    @GetMapping("/ordersAdmin")
    public String getAllOrderAdmin(Model model){
        model.addAttribute("orders",iMyDAO.getAllOrder());
        model.addAttribute("animators",iMyDAO.getAllAnimator());
        model.addAttribute("orderhasresourses",iMyDAO.getAllOrderHasResources());
        return "ordersAdmin";
    }
    @GetMapping("/createOrder/{id}")
    public  String updateOrder(@PathVariable int id, Model model){
        model.addAttribute("animator",iMyDAO.getAnimator(id));
        List<Costume> costumes  = iMyDAO.getAllCostume();
        model.addAttribute("costumes", costumes);
        return "createOrder";
    }
    @PostMapping("/createOrder")
    public  String createOrder(@ModelAttribute("Order") Order order ) throws SQLException {
        iMyDAO.insertOrder(order);
        return "redirect:/ordersAdmin";
    }
    @GetMapping("/vivod")
    public String getAllvivod(Model model){
        model.addAttribute("tests",iMyDAO.getAllvivod());
        return "vivod";
    }
}
