package com.example.demo.DAO;

import com.example.demo.Entity.*;

import java.sql.SQLException;
import java.util.ArrayList;

public interface IMyDAO {
    void insertAnimator(Animator animator) throws SQLException;
    void deleteAnimator(int id);
    void updateAnimator(Animator animator);
    Animator getAnimator(int id);
    ArrayList<Animator> getAllAnimator();
    //////////////////////////////////////////////////////////
    void insertCategory(Category category) throws SQLException;
    void deleteCategory(int id);
    void updateCategory(Category category);
    Category getCategory(int id);
    ArrayList<Category> getAllCategory();
    //////////////////////////////////////////////////////////
    void insertCostume(Costume costume) throws SQLException;
    void deleteCostume(int id);
    void updateCostume(Costume costume);
    Costume getCostume(int id);
    ArrayList<Costume> getAllCostume();
    public ArrayList<Vivod> getAllvivod();
    //////////////////////////////////////////////////////////
    void insertOrder(Order order) throws SQLException;
    void deleteOrder(int id);
    void updateOrder(Order order);
    Order getOrder(int id);
    ArrayList<Order> getAllOrder();
    //////////////////////////////////////////////////////////
    void insertOrderHasResources(OrderHasResources orderHasResources) throws SQLException;
    void deleteOrderHasResources(int id);
    void updateOrderHasResources(OrderHasResources orderHasResources);
    OrderHasResources getOrderHasResources(int id);
    ArrayList<OrderHasResources> getAllOrderHasResources();
    //////////////////////////////////////////////////////////
    void insertRealisation(Realisation realisation) throws SQLException;
    void deleteRealisation(int id);
    void updateRealisation(Realisation realisation);
    Realisation getRealisation(int id);
    ArrayList< Realisation > getAllRealisation();
    //////////////////////////////////////////////////////////
    void insertRole(Role role) throws SQLException;
    void deleteRole(int id);
    void updateRole(Role role);
    Role getRole(int id);
    ArrayList< Role > getAllRole();
    //////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////
    void insertUser(User user) throws SQLException;
    void deleteUser(int id);
    void updateUser(User user);
    User getUser(int id);
    ArrayList< User > getAllUser();
    //////////////////////////////////////////////////////////
}


