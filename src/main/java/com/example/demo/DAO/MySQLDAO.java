package com.example.demo.DAO;


import com.example.demo.Entity.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MySQLDAO implements IMyDAO {
    private static Connection con = null;

    public MySQLDAO() {
    }

    @Override
    public void insertAnimator(Animator animator) throws SQLException {
        try (Connection con = ConnectionFactory.getConnection()) {
            final Statement stm = con.createStatement();
            String query = "INSERT INTO animator (animator_id, name, description,costume_id,price) VALUES ('" + animator.getId() + "','" + animator.getName() + "','" + animator.getDescription() + "','" + animator.getCostume_id() + "','"+ animator.getPrice() +"') ";
            stm.executeUpdate(query);
        } catch (SQLException y) {
            y.printStackTrace();
        }
    }

    @Override
    public void deleteAnimator(int id) {

    }

    @Override
    public void updateAnimator(Animator animator) {

    }

    @Override
    public Animator getAnimator(int id) {
        try (Connection con = ConnectionFactory.getConnection(); PreparedStatement st = con.prepareStatement("SELECT * FROM animator WHERE animator_id=?");) {
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            while (rs.next()) { //if rs.next() returns false
                return new Animator(id, rs.getString("name"), rs.getString("description"),getCostume(rs.getInt("costume_id")) ,rs.getInt("price"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(MySQLDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public ArrayList<Animator> getAllAnimator() {
        ArrayList<Animator> res = new ArrayList<>();
        try (Connection con = ConnectionFactory.getConnection(); Statement stm = con.createStatement(); ResultSet rs = stm.executeQuery("select * from animator  ");) {
            while (rs.next()) { //if rs.next() returns false
                res.add(new Animator(rs.getInt("animator_id"), rs.getString("name"), rs.getString("description"),getCostume(rs.getInt("costume_id")) ,rs.getInt("price")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }

    @Override
    public void insertCategory(Category category) throws SQLException {

    }

    @Override
    public void deleteCategory(int id) {

    }

    @Override
    public void updateCategory(Category category) {

    }

    @Override
    public Category getCategory(int id) {
        return null;
    }

    @Override
    public ArrayList<Category> getAllCategory() {
        return null;
    }

    @Override
    public void insertCostume(Costume costume) throws SQLException {

    }

    @Override
    public void deleteCostume(int id) {

    }

    @Override
    public void updateCostume(Costume costume) {

    }

    @Override
    public Costume getCostume(int id) {
        try (Connection con = ConnectionFactory.getConnection(); PreparedStatement st = con.prepareStatement("SELECT * FROM costume WHERE costume_id=?");) {
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            while (rs.next()) { //if rs.next() returns falseprice
                return new Costume(id, rs.getString("name"), rs.getInt("amount"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(MySQLDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public ArrayList<Costume> getAllCostume() {
        ArrayList<Costume> res = new ArrayList<>();
        try (Connection con = ConnectionFactory.getConnection(); Statement stm = con.createStatement(); ResultSet rs = stm.executeQuery("select * from costume  ");) {
            while (rs.next()) { //if rs.next() returns false
                res.add(new Costume(rs.getInt("costume_id"), rs.getString("name"), rs.getInt("amount")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }

    @Override
    public void insertOrder(Order order) throws SQLException {

    }

    @Override
    public void deleteOrder(int id) {

    }

    @Override
    public void updateOrder(Order order) {

    }

    @Override
    public Order getOrder(int id) {
        try (Connection con = ConnectionFactory.getConnection(); PreparedStatement st = con.prepareStatement("SELECT * FROM `order` WHERE order_id=?");) {
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            while (rs.next()) { //if rs.next() returns false
                return new Order(id,getUser(rs.getInt("user_id")),getRealisation(rs.getInt("realisation_id")),getStatus(rs.getInt("status_id")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(MySQLDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public ArrayList<Order> getAllOrder() {
        return null;
    }

    @Override
    public void insertOrderHasResources(OrderHasResources orderHasResources) throws SQLException {

    }

    @Override
    public void deleteOrderHasResources(int id) {

    }

    @Override
    public void updateOrderHasResources(OrderHasResources orderHasResources) {

    }

    @Override
    public OrderHasResources getOrderHasResources(int id) {
        return null;
    }

    @Override
    public ArrayList<OrderHasResources> getAllOrderHasResources() {
        ArrayList<OrderHasResources> res = new ArrayList<>();
        try (Connection con = ConnectionFactory.getConnection(); Statement stm = con.createStatement(); ResultSet rs = stm.executeQuery("SELECT animator.name as name, sum(animator.price) as Сумма\n" +
                "\t\tFROM order_has_resourses,animator\n" +
                "\t\twhere  order_has_resourses.animator_id = animator.animator_id\n" +
                "\t\tgroup by animator.name\n" +
                "\t\torder by sum(animator.price) desc");) {
            while (rs.next()) { //if rs.next() returns false
                res.add(new OrderHasResources(getAnimator(rs.getInt("animator_id")), getOrder(rs.getInt("order_id")), rs.getInt("amount"),rs.getInt("price")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }

    @Override
    public void insertRealisation(Realisation realisation) throws SQLException {

    }

    @Override
    public void deleteRealisation(int id) {

    }

    @Override
    public void updateRealisation(Realisation realisation) {

    }

    @Override
    public Realisation getRealisation(int id) {
        try (Connection con = ConnectionFactory.getConnection(); PreparedStatement st = con.prepareStatement("SELECT * FROM realisation WHERE realisation_id=?");) {
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            while (rs.next()) { //if rs.next() returns false
                return new Realisation(id, rs.getString("address"),rs.getString("contactName"),rs.getInt("contactPhone"),rs.getString("contactMail"),getUser(rs.getInt("user_id")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(MySQLDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public ArrayList<Realisation> getAllRealisation() {
        return null;
    }

    @Override
    public void insertRole(Role role) throws SQLException {

    }

    @Override
    public void deleteRole(int id) {

    }

    @Override
    public void updateRole(Role role) {

    }

    @Override
    public Role getRole(int id) {
        try (Connection con = ConnectionFactory.getConnection(); PreparedStatement st = con.prepareStatement("SELECT * FROM role WHERE role_id=?");) {
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            while (rs.next()) { //if rs.next() returns false
                return new Role(id, rs.getString("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(MySQLDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public ArrayList<Role> getAllRole() {
        return null;
    }

    @Override
    public void insertStatus(Status status) throws SQLException {

    }

    @Override
    public void deleteStatus(int id) {

    }

    @Override
    public void updateStatus(Status status) {

    }

    @Override
    public Status getStatus(int id) {
        try (Connection con = ConnectionFactory.getConnection(); PreparedStatement st = con.prepareStatement("SELECT * FROM status WHERE status_id=?")) {
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            while (rs.next()) { //if rs.next() returns false
                return new Status(id, rs.getString("status_name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(MySQLDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public ArrayList<Status> getAllStatus() {
        return null;
    }

    @Override
    public void insertUser(User user) throws SQLException {
        try (Connection con = ConnectionFactory.getConnection()) {
            final Statement stm = con.createStatement();
            String query = "INSERT INTO user (user_id, login, password,name) VALUES ('" + user.getId() + "','" + user.getLogin() + "','" + user.getPassword() + "','" + user.getName() + "') ";
            stm.executeUpdate(query);
        } catch (SQLException y) {
            y.printStackTrace();
        }
    }

    @Override
    public void deleteUser(int id) {

    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public User getUser(int id) {
        try (Connection con = ConnectionFactory.getConnection(); PreparedStatement st = con.prepareStatement("SELECT * FROM user WHERE user_id=?");) {
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            while (rs.next()) { //if rs.next() returns false
                return new User(id,rs.getString("login"),rs.getString("password"),rs.getString("name"),getRole(rs.getInt("role_id")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(MySQLDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public ArrayList<User> getAllUser() {
        ArrayList<User> res = new ArrayList<>();
        try (Connection con = ConnectionFactory.getConnection(); Statement stm = con.createStatement(); ResultSet rs = stm.executeQuery("select * from user  ");) {
            while (rs.next()) { //if rs.next() returns false
                res.add(new User(rs.getInt("user_id"),rs.getString("login"),rs.getString("password"),rs.getString("name"),getRole(rs.getInt("role_id"))));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }
    public ArrayList<Vivod> getAllvivod(){
        ArrayList<Vivod> res = new ArrayList<>();
        try (Connection con = ConnectionFactory.getConnection(); Statement stm = con.createStatement(); ResultSet rs = stm.executeQuery("SELECT animator.name as name, sum(animator.price) as Сумма\n" +
                "\t\tFROM order_has_resourses,animator\n" +
                "\t\twhere  order_has_resourses.animator_id = animator.animator_id\n" +
                "\t\tgroup by animator.name\n" +
                "\t\torder by `Сумма` desc");) {
            while (rs.next()) { //if rs.next() returns false
                res.add(new Vivod(rs.getString("name"),rs.getInt("Сумма")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }
}

