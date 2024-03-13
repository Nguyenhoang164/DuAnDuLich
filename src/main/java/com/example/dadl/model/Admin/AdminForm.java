package com.example.dadl.model.Admin;

import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

public class AdminForm {
    private int id;
    private String fullName;
    private String number;
    private String address;
    private MultipartFile avatar;
    private String staffPosition;
    private Date dateOfBirth;
    private String email;

    public AdminForm(int id, String fullName, String number, String address, MultipartFile avatar, String staffPosition, Date dateOfBirth , String email) {
        this.id = id;
        this.fullName = fullName;
        this.number = number;
        this.address = address;
        this.avatar = avatar;
        this.staffPosition = staffPosition;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
    }
    public AdminForm(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public MultipartFile getAvatar() {
        return avatar;
    }

    public void setAvatar(MultipartFile avatar) {
        this.avatar = avatar;
    }

    public String getStaffPosition() {
        return staffPosition;
    }

    public void setStaffPosition(String staffPosition) {
        this.staffPosition = staffPosition;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
