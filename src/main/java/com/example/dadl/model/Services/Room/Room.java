package com.example.dadl.model.Services.Room;

import com.example.dadl.model.Services.Service.Service;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    private String name;
    @NotNull
    private String pictureRoom;
    @NotNull
    private String convenient;
    @NotNull
    private int numberOfBed;
    @NotNull
    private int numberOfCustomer;
    private String status;
    @NotNull
    private String descriptions;
    @NotNull
    private String price;
    @NotNull
    private String detail;
    @ManyToOne
    @JoinColumn(name = "id_service")
    private Service service;

    public Room(int id, String name, String pictureRoom, String convenient, int numberOfBed, int numberOfCustomer, String status, String descriptions, String price, String detail, Service service) {
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
        this.service = service;
    }

    public Room() {
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

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }
}
