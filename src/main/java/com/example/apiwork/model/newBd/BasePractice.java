package com.example.apiwork.model.newBd;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class BasePractice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBase;

    @Column(length = 50, nullable = false)
    private String nameOrganization;
    @Column(length = 100, nullable = false)
    private String adressOrganization;
    @Column(length = 50, nullable = false)
    private String numberPhone;
    @Column(length = 50, nullable = false)
    private String email;
    private String photoURL;

    private String URLAdress;
    @Column(length = 50, nullable = false)
    private String metro;

    public String getPhotoURL() {
        return photoURL;
    }

    public void setPhotoURL(String photoURL) {
        this.photoURL = photoURL;
    }

    public String getURLAdress() {
        return URLAdress;
    }

    public void setURLAdress(String URLAdress) {
        this.URLAdress = URLAdress;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "basePractice", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<HeadOrganization> groups;

    public BasePractice() {

    }

    public Long getIdBase() {
        return idBase;
    }

    public void setIdBase(Long idBase) {
        this.idBase = idBase;
    }

    public String getNameOrganization() {
        return nameOrganization;
    }

    public void setNameOrganization(String nameOrganization) {
        this.nameOrganization = nameOrganization;
    }

    public String getAdressOrganization() {
        return adressOrganization;
    }

    public void setAdressOrganization(String adressOrganization) {
        this.adressOrganization = adressOrganization;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<HeadOrganization> getGroups() {
        return groups;
    }

    public void setGroups(List<HeadOrganization> groups) {
        this.groups = groups;
    }

    public String getMetro() {
        return metro;
    }

    public void setMetro(String metro) {
        this.metro = metro;
    }

    public BasePractice(String nameOrganization, String adressOrganization, String numberPhone, String email,
                        String photoURL, String URLAdress, String metro) {
        this.nameOrganization = nameOrganization;
        this.adressOrganization = adressOrganization;
        this.numberPhone = numberPhone;
        this.email = email;
        this.photoURL = photoURL;
        this.URLAdress = URLAdress;
        this.metro = metro;
    }
}
