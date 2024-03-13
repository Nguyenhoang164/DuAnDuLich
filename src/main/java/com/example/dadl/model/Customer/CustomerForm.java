package com.example.dadl.model.Customer;

import org.springframework.web.multipart.MultipartFile;


public class CustomerForm {
    private int id;
    private String fullName;
    private String nickName;
    private String number;
    private String address;
    private MultipartFile avatar;
    private String email;

    public CustomerForm() {
    }

    public CustomerForm(int id, String fullName, String nickName, String number, String address, MultipartFile avatar, String email) {
        this.id = id;
        this.fullName = fullName;
        this.nickName = nickName;
        this.number = number;
        this.address = address;
        this.avatar = avatar;
        this.email = email;
    }

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

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
