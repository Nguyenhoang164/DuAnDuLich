package com.example.dadl.model.Services.Vacation;

import javax.validation.constraints.NotNull;

public class VacationForm {
    private int id;
    private String tile;

    private String picture;

    private String descriptions;

    public VacationForm(int id, String tile, String picture, String descriptions) {
        this.id = id;
        this.tile = tile;
        this.picture = picture;
        this.descriptions = descriptions;
    }

    public VacationForm() {
    }

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
}
