package com.example.libraryManagement.CustomerController;

import com.example.libraryManagement.CustomerDTO.CustomerDTO;
import com.example.libraryManagement.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/V1/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;


    @PostMapping(path = "/save")
    public String saveCustomer(@RequestBody CustomerDTO customerDTO){
        String id = customerService.addCustomr(customerDTO);
        re

    }

}
