package com.example.libraryManagement.DTO;

import jakarta.persistence.Column;

public class CustomerDTO {

    private int customerId;
    private String customerName;
    private String customerAddress;
    private String mobile;

    public CustomerDTO() {
    }

    public CustomerDTO(String customerName, String customerAddress, String mobile) {
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.mobile = mobile;
    }

    public CustomerDTO(int customerId, String customerName, String customerAddress, String mobile) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.mobile = mobile;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
