package com.example.MPTSait.model.newBd;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;

import java.util.List;

@Entity
public class Specialization {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSpec;

    @Column(length = 20, nullable = false)
    @NotEmpty(message = "Отсутствует значение")
    private String numberSpec;
    @Column(length = 100, nullable = false)
    @NotEmpty(message = "Отсутствует значение")
    private String nameSpec;

    @OneToMany(mappedBy = "specialization")
    private List<Course> courses;

    public Long getIdSpec() {
        return idSpec;
    }

    public void setIdSpec(Long idSpec) {
        this.idSpec = idSpec;
    }

    public String getNumberSpec() {
        return numberSpec;
    }

    public void setNumberSpec(String numberSpec) {
        this.numberSpec = numberSpec;
    }

    public String getNameSpec() {
        return nameSpec;
    }

    public void setNameSpec(String nameSpec) {
        this.nameSpec = nameSpec;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public Specialization(String numberSpec, String nameSpec) {
        this.numberSpec = numberSpec;
        this.nameSpec = nameSpec;
    }

    public Specialization() {

    }
}
