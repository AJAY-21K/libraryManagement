package com.example.libraryManagement.CustomerService;

import com.example.libraryManagement.DTO.CustomerDTO;
import com.example.libraryManagement.DTO.CustomerSaveDTO;

public interface CustomerService {
    String addCustomer(CustomerSaveDTO customerDTO);
}
