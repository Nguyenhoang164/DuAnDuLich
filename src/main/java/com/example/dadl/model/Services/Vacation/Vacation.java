package com.example.dadl.model.Services.Vacation;

import com.example.dadl.model.Services.Service.Service;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Vacation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    private String tile;
    @NotNull
    private String picture;
    @NotNull
    private String descriptions;
    @ManyToOne
    @JoinColumn(name = "id_service")
    private Service service;

    public Vacation(int id, String tile, String picture, String descriptions, Service service) {
        this.id = id;
        this.tile = tile;
        this.picture = picture;
        this.descriptions = descriptions;
        this.service = service;
    }
    public Vacation(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTile() {
        return tile;
    }

    public void setTile(String tile) {
        this.tile = tile;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
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
}
