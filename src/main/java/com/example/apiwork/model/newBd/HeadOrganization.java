package com.example.MPTSait.model.newBd;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;

import java.util.List;

@Entity
public class HeadOrganization {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idHeadOrg;
    @Column(length = 50, nullable = false)
    private String lastnameOrg;
    @Column(length = 50, nullable = false)
    @NotEmpty(message = "Отсутствует значение")
    private String nameOrg;
    @Column(length = 50)
    private String surnameOrg;

    @Column(length = 50, nullable = false)
    @NotEmpty(message = "Отсутствует значение")
    private String post;
    @Column(length = 50, nullable = false)
    @NotEmpty(message = "Отсутствует значение")
    private String numberPhone;
    @Column(length = 50, nullable = false)
    @NotEmpty(message = "Отсутствует значение")
    private String email;

    @OneToMany(mappedBy = "headOrganization")
    @Column(nullable = false)
    private List<PracticeInformation> practices;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "base_practice_id", nullable = false)
    private BasePractice basePractice;

    public List<PracticeInformation> getPractices() {
        return practices;
    }

    public void setPractices(List<PracticeInformation> practices) {
        this.practices = practices;
    }

    public Long getIdHeadOrg() {
        return idHeadOrg;
    }

    public void setIdHeadOrg(Long idHeadOrg) {
        this.idHeadOrg = idHeadOrg;
    }

    public String getLastnameOrg() {
        return lastnameOrg;
    }

    public void setLastnameOrg(String lastnameOrg) {
        this.lastnameOrg = lastnameOrg;
    }

    public String getNameOrg() {
        return nameOrg;
    }

    public void setNameOrg(String nameOrg) {
        this.nameOrg = nameOrg;
    }

    public String getSurnameOrg() {
        return surnameOrg;
    }

    public void setSurnameOrg(String surnameOrg) {
        this.surnameOrg = surnameOrg;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
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

    public BasePractice getBasePractice() {
        return basePractice;
    }

    public void setBasePractice(BasePractice basePractice) {
        this.basePractice = basePractice;
    }

    public HeadOrganization(String lastnameOrg, String nameOrg, String surnameOrg, String post, String numberPhone,
                            String email, BasePractice basePractice) {
        this.lastnameOrg = lastnameOrg;
        this.nameOrg = nameOrg;
        this.surnameOrg = surnameOrg;
        this.post = post;
        this.numberPhone = numberPhone;
        this.email = email;
        this.basePractice = basePractice;
    }

    public HeadOrganization() {

    }
}
