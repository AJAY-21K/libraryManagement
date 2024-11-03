package com.example.libraryManagement.CustomerService;

import com.example.libraryManagement.DTO.CustomerDTO;
import com.example.libraryManagement.DTO.CustomerSaveDTO;

import java.util.List;

public interface CustomerService {
    String addCustomer(CustomerSaveDTO customerDTO);

    List<CustomerDTO> getAllCustomer();
}
