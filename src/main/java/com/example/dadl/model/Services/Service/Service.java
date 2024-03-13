package com.example.dadl.model.Services.Service;

import com.example.dadl.model.Supplier.Supplier;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    private String serviceNameVN;
    @NotNull
    private String serviceNameEN;
    @NotNull
    private String businessType;
    @NotBlank
    private double evaluate;
    @NotNull
    private String servicePicture;
    @NotNull
    private String price;
    @NotNull
    private String introducingTheAccommodationFacility;
    @NotNull
    private String topic;
    @NotNull
    private Date dateCreate;
    @ManyToOne
    @JoinColumn(name = "id_supplier")
    private Supplier supplier;
    @NotNull
    private String status;
    public Service(int id, String serviceNameVN, String serviceNameEN, String businessType, double evaluate, String servicePicture, String price, String introducingTheAccommodationFacility , String topic , String status , Date dateCreate) {
        this.id = id;
        this.serviceNameVN = serviceNameVN;
        this.serviceNameEN = serviceNameEN;
        this.businessType = businessType;
        this.evaluate = evaluate;
        this.servicePicture = servicePicture;
        this.price = price;
        this.introducingTheAccommodationFacility = introducingTheAccommodationFacility;
        this.topic = topic;
        this.status = status;
        this.dateCreate = dateCreate;
    }

    public Service() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getServiceNameVN() {
        return serviceNameVN;
    }

    public void setServiceNameVN(String serviceNameVN) {
        this.serviceNameVN = serviceNameVN;
    }

    public String getServiceNameEN() {
        return serviceNameEN;
    }

    public void setServiceNameEN(String serviceNameEN) {
        this.serviceNameEN = serviceNameEN;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public double getEvaluate() {
        return evaluate;
    }

    public void setEvaluate(double evaluate) {
        this.evaluate = evaluate;
    }

    public String getServicePicture() {
        return servicePicture;
    }

    public void setServicePicture(String servicePicture) {
        this.servicePicture = servicePicture;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getIntroducingTheAccommodationFacility() {
        return introducingTheAccommodationFacility;
    }

    public void setIntroducingTheAccommodationFacility(String introducingTheAccommodationFacility) {
        this.introducingTheAccommodationFacility = introducingTheAccommodationFacility;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
