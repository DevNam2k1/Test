/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.testjsp.controller;

import com.testjsp.bean.Customer;
import com.testjsp.dao.impl.CustomerDAO;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author laptop88
 */
public class CustomerController extends HttpServlet{
    
    private static final long serialVersionUID = 1L;
    
    private final CustomerDAO customerDAO = new CustomerDAO();
    
        protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
         String uri = request.getServletPath();

		switch (uri) {                   
                    case "/":
                        this.showCustomerList(request, response);
                        break;
                    case "/search":
                        this.searchCustomerName(request, response);
                        break;

		default:
			break;
		}
    }

    private void showCustomerList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          List<Customer> customer = customerDAO.findAll();
        request.setAttribute("listCustomer", customer);
        RequestDispatcher dispatcher = 
		request.getRequestDispatcher("index.jsp");
                dispatcher.forward(request, response);
    }

    private void searchCustomerName(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("customer");
        
        List<Customer> customerSearch = customerDAO.findCustomerName(name);
                request.setAttribute("listCustomer", customerSearch);
        RequestDispatcher dispatcher = 
		request.getRequestDispatcher("index.jsp");
                dispatcher.forward(request, response);
    }

    
}
