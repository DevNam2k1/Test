/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.testjsp.dao.impl;

import com.testjsp.bean.Customer;
import com.testjsp.connection.Connector;
import com.testjsp.dao.ICustomerDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author laptop88
 */
public class CustomerDAO implements ICustomerDAO{

    @Override
    public List<Customer> findAll() {
                 List<Customer> customers = new ArrayList<>();

        try (Connection connection =Connector.getConnection();

           
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM customers ")) {
            System.out.println(preparedStatement);
         
            ResultSet rs = preparedStatement.executeQuery();

           
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String address = rs.getString("address");
                customers.add(new Customer(id, name, age, address));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return customers;
    }


    @Override
    public List<Customer> findCustomerName(String nameCustomer) {

        List<Customer> customer = new ArrayList<>();
        
                try (Connection connection =Connector.getConnection();

            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM customers where name  like  ?")) {
            System.out.println(preparedStatement);
            preparedStatement.setString(1,"%"+nameCustomer+"%");
          
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String address = rs.getString("address");
                customer.add(new Customer(id, name, age, address));
            }
        } catch (SQLException e) {
           
        }
        return customer;
    }
    
}
