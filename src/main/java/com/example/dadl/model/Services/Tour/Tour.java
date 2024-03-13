package com.example.dadl.model.Services.Tour;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Tour {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    private String name;
    @NotNull
    private String descriptions;

}
