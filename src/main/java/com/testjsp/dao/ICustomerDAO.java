/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.testjsp.dao;

import com.testjsp.bean.Customer;
import java.util.List;

/**
 *
 * @author laptop88
 */
public interface ICustomerDAO {
    //Danh sách bác sĩ
    List<Customer> findAll();
    
    //Tìm kiếm theo tên
    List<Customer> findCustomerName(String nameCustomer);
}
