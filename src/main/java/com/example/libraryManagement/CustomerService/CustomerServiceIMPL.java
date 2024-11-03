package com.example.libraryManagement.CustomerService;

import com.example.libraryManagement.CustomerRepo.CustomerRepo;
import com.example.libraryManagement.DTO.CustomerDTO;
import com.example.libraryManagement.DTO.CustomerSaveDTO;
import com.example.libraryManagement.Entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
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

    @Override
    public List<CustomerDTO> getAllCustomer() {
        List<Customer> getCustomer = customerRepo.findAll();
        List<CustomerDTO> customerDTOList =new ArrayList<>();
        for(Customer a:getCustomer){
            CustomerDTO customerDTO = new CustomerDTO(
                    a.getCustomerId(),
                    a.getCustomerName(),
                    a.getCustomerAddress(),
                    a.getMobile()

            );
            customerDTOList.add(customerDTO);

        }
        return customerDTOList;
    }
}
