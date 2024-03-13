package com.example.dadl.model.Services.Room;

import javax.validation.constraints.NotNull;

public class RoomForm {
    private int id;

    private String name;

    private String pictureRoom;

    private String convenient;

    private int numberOfBed;

    private int numberOfCustomer;
    private String status;

    private String descriptions;

    private String price;

    private String detail;

    public RoomForm(int id, String name, String pictureRoom, String convenient, int numberOfBed, int numberOfCustomer, String status, String descriptions, String price, String detail) {
        this.id = id;
        this.name = name;
        this.pictureRoom = pictureRoom;
        this.convenient = convenient;
        this.numberOfBed = numberOfBed;
        this.numberOfCustomer = numberOfCustomer;
        this.status = status;
        this.descriptions = descriptions;
        this.price = price;
        this.detail = detail;
    }

    public RoomForm() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPictureRoom() {
        return pictureRoom;
    }

    public void setPictureRoom(String pictureRoom) {
        this.pictureRoom = pictureRoom;
    }

    public String getConvenient() {
        return convenient;
    }

    public void setConvenient(String convenient) {
        this.convenient = convenient;
    }

    public int getNumberOfBed() {
        return numberOfBed;
    }

    public void setNumberOfBed(int numberOfBed) {
        this.numberOfBed = numberOfBed;
    }

    public int getNumberOfCustomer() {
        return numberOfCustomer;
    }

    public void setNumberOfCustomer(int numberOfCustomer) {
        this.numberOfCustomer = numberOfCustomer;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
