package com.example.demo;


import com.example.demo.DAO.IMyDAO;
import com.example.demo.DAO.MySQLDAO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfig {

    @Bean
    public IMyDAO getImyDao(){
        return new MySQLDAO();
    }
}
