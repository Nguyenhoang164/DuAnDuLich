package com.example.dadl.model.Services.Activity;

import com.example.dadl.model.Services.Service.Service;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Activity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    private String nameVN;
    @NotNull
    private String nameEN;
    @NotNull
    private String address;
    @NotNull
    private String timeOpenAndClose;
    @NotNull
    private String descriptions;
    @ManyToOne
    @JoinColumn(name = "id_service")
    private Service service;
    @NotNull
    private String status;

    public Activity(int id, String nameVN, String nameEN, String address, String timeOpenAndClose, String descriptions, Service service, String status) {
        this.id = id;
        this.nameVN = nameVN;
        this.nameEN = nameEN;
        this.address = address;
        this.timeOpenAndClose = timeOpenAndClose;
        this.descriptions = descriptions;
        this.service = service;
        this.status = status;
    }

    public Activity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameVN() {
        return nameVN;
    }

    public void setNameVN(String nameVN) {
        this.nameVN = nameVN;
    }

    public String getNameEN() {
        return nameEN;
    }

    public void setNameEN(String nameEN) {
        this.nameEN = nameEN;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTimeOpenAndClose() {
        return timeOpenAndClose;
    }

    public void setTimeOpenAndClose(String timeOpenAndClose) {
        this.timeOpenAndClose = timeOpenAndClose;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
