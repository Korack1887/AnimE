package com.example.demo.DAO;

public class DAOFactory {
    private static IMyDAO dao = null;

    public static IMyDAO getDAOInstance(TypeDAO type){
        if (type == TypeDAO.MySQL) {
            dao = new MySQLDAO();
        }

        return dao;
    }

}
