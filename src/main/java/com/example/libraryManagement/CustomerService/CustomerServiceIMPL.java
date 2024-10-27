package com.example.libraryManagement.CustomerService;

import com.example.libraryManagement.CustomerRepo.CustomerRepo;
import com.example.libraryManagement.DTO.CustomerSaveDTO;
import com.example.libraryManagement.Entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerServiceIMPL implements CustomerService{

    @Autowired
    private CustomerRepo customerRepo;

    @Override
    public String addCustomer(CustomerSaveDTO customerSaveDTO){
        Customer customer = new Customer(
                customerSaveDTO.getCustomerName(),
                customerSaveDTO.getCustomerAddress(),
                customerSaveDTO.getMobile()
        );
        customerRepo.save(customer);
        return customer.getCustomerName();
    }
}
