package com.sciencom.training.customerapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sciencom.training.customerapp.dao.CustomerDao;
import com.sciencom.training.customerapp.dao.CustomerDaoImpl;
import com.sciencom.training.customerapp.model.Customer;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        
        /* Create Customer Object */
        Customer customer = new Customer();
        customer.setName("Zinedine");
        customer.setEmail("zen@gmail.com");
        customer.setPhone("098878868");
        
        CustomerDao dao = (CustomerDaoImpl)context.getBean("customerDaoImpl");
        
        for(Customer c: dao.read()){
        	c.setEmail("xxx@yyy.com");
        	dao.update(c);
        }
        
        try {
        	dao.create(customer);			
		} catch (Exception e) {
			System.out.println("Erro saat insert customer: " + e.getMessage());
		}
        
    }
}
