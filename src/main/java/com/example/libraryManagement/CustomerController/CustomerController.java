package com.example.libraryManagement.CustomerController;


import com.example.libraryManagement.CustomerService.CustomerService;
import com.example.libraryManagement.DTO.CustomerDTO;
import com.example.libraryManagement.DTO.CustomerSaveDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/V1/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;


    @PostMapping(path = "/save")
    public String saveCustomer(@RequestBody CustomerSaveDTO customerSaveDTO){
        String id = customerService.addCustomer(customerSaveDTO);
        return id;

    }
    @GetMapping(path = "/getAll")
    public List<CustomerDTO> getAllCustomer()
    {
        List<CustomerDTO>allCustomers = customerService.getAllCustomer();
        return allCustomers;

    }

}
