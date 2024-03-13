package com.example.dadl.model.Services.Bill;

import com.example.dadl.model.Services.Service.Service;
import com.example.dadl.model.Supplier.Supplier;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.xml.crypto.Data;
import java.util.Date;

@Entity
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    private String nameBill;
    @NotNull
    private String seriesBill;
    @NotNull
    private Date dateCreate;
    @ManyToOne
    @JoinColumn(name = "id_service")
    private Service service;
    @ManyToOne
    @JoinColumn(name = "id_supplier")
    private Supplier supplier;
    @NotNull
    private String status;

    public Bill(int id, String nameBill, String seriesBill, Date dateCreate, Service service, Supplier supplier, String status) {
        this.id = id;
        this.nameBill = nameBill;
        this.seriesBill = seriesBill;
        this.dateCreate = dateCreate;
        this.service = service;
        this.supplier = supplier;
        this.status = status;
    }

    public Bill() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameBill() {
        return nameBill;
    }

    public void setNameBill(String nameBill) {
        this.nameBill = nameBill;
    }

    public String getSeriesBill() {
        return seriesBill;
    }

    public void setSeriesBill(String seriesBill) {
        this.seriesBill = seriesBill;
    }

    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
