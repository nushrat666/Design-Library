package com.tuli.designlibrary;

import java.io.Serializable;

public class EmployeeAddress implements Serializable {

    private String houseNo;
    private String roadNo;
    private String city;
    private String ripCode;
    private String phone;
    private String emailAddress;

    public EmployeeAddress(String houseNo, String roadNo, String city, String ripCode, String phone, String emailAddress) {
        this.houseNo = houseNo;
        this.roadNo = roadNo;
        this.city = city;
        this.ripCode = ripCode;
        this.phone = phone;
        this.emailAddress = emailAddress;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public String getRoadNo() {
        return roadNo;
    }

    public void setRoadNo(String roadNo) {
        this.roadNo = roadNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRipCode() {
        return ripCode;
    }

    public void setRipCode(String ripCode) {
        this.ripCode = ripCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "EmployeeAddress{" +
                "houseNo='" + houseNo + '\'' +
                ", roadNo='" + roadNo + '\'' +
                ", city='" + city + '\'' +
                ", ripCode='" + ripCode + '\'' +
                ", phone='" + phone + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }
}
