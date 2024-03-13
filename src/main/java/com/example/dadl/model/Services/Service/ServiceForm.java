package com.example.dadl.model.Services.Service;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

public class ServiceForm {
    private int id;
    private String serviceNameVN;

    private String serviceNameEN;

    private String businessType;

    private double evaluate;

    private String servicePicture;

    private String price;

    private String introducingTheAccommodationFacility;

    private String topic;
    private Date dateCreate;

    public ServiceForm(int id, String serviceNameVN, String serviceNameEN, String businessType, double evaluate, String servicePicture, String price, String introducingTheAccommodationFacility, String topic , Date dateCreate) {
        this.id = id;
        this.serviceNameVN = serviceNameVN;
        this.serviceNameEN = serviceNameEN;
        this.businessType = businessType;
        this.evaluate = evaluate;
        this.servicePicture = servicePicture;
        this.price = price;
        this.introducingTheAccommodationFacility = introducingTheAccommodationFacility;
        this.topic = topic;
        this.dateCreate = dateCreate;
    }

    public ServiceForm() {
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

    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }
}
