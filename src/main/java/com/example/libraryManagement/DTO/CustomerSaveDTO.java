package com.example.libraryManagement.DTO;

public class CustomerSaveDTO {
    private String customerName;
    private String customerAddress;
    private String mobile;


    public CustomerSaveDTO(String customerName, String customerAddress, String mobile) {
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.mobile = mobile;
    }

    public CustomerSaveDTO() {
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
                ", customerName='" + customerName + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
