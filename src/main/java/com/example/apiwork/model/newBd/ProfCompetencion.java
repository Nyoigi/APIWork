package com.example.apiwork.model.newBd;


import jakarta.persistence.*;

@Entity
public class ProfCompetencion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProfCompetencion;

    @Column(length = 20, nullable = false)
    private String numberProfComp;

    @Column(length = 100, nullable = false)
    private String nameCompetencion;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "profModuleID", nullable = false)
    private ProfModule profModule;


    public Long getIdProfCompetencion() {
        return idProfCompetencion;
    }

    public void setIdProfCompetencion(Long idProfCompetencion) {
        this.idProfCompetencion = idProfCompetencion;
    }

    public String getNumberProfComp() {
        return numberProfComp;
    }

    public void setNumberProfComp(String numberProfComp) {
        this.numberProfComp = numberProfComp;
    }

    public String getNameCompetencion() {
        return nameCompetencion;
    }

    public void setNameCompetencion(String nameCompetencion) {
        this.nameCompetencion = nameCompetencion;
    }

    public ProfModule getProfModule() {
        return profModule;
    }

    public void setProfModule(ProfModule profModule) {
        this.profModule = profModule;
    }

    public ProfCompetencion(String numberProfComp, String nameCompetencion, ProfModule profModule) {
        this.numberProfComp = numberProfComp;
        this.nameCompetencion = nameCompetencion;
        this.profModule = profModule;
    }

    public ProfCompetencion() {

    }
}
