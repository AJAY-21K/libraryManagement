package com.example.libraryManagement.Entity;

import jakarta.persistence.*;

@Table(name = "customer")
public class Customer {

    @Id
    @Column(name = "customerId", length = 50)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int customerId;

    @Column(name = "customerName", length = 50)
    private String customerName;

    @Column(name = "customerAddress", length = 70)
    private String customerAddress;

    @Column(name = "mobile", length = 10)
    private String mobile;

    public Customer() {
    }

    public Customer(String customerName, String customerAddress, String mobile) {
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.mobile = mobile;
    }

    public Customer(int customerId, String customerName, String customerAddress, String mobile) {
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
        return "Customer{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
