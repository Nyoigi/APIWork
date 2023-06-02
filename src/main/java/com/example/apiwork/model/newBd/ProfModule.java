package com.example.MPTSait.model.newBd;

import jakarta.persistence.*;

@Entity
public class ProfModule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20, nullable = false)
    private String numberModule;

    @Column(length = 100, nullable = false)
    private String nameModule;

    @OneToOne(mappedBy = "profModule")
    private Practice practice;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumberModule() {
        return numberModule;
    }

    public void setNumberModule(String numberModule) {
        this.numberModule = numberModule;
    }

    public String getNameModule() {
        return nameModule;
    }

    public void setNameModule(String nameModel) {
        this.nameModule = nameModel;
    }

    public Practice getPractice() {
        return practice;
    }

    public void setPractice(Practice practice) {
        this.practice = practice;
    }

    public ProfModule(String numberModule, String nameModule) {
        this.numberModule = numberModule;
        this.nameModule = nameModule;
    }

    public ProfModule() {

    }
}
