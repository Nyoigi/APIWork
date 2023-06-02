package com.example.MPTSait.model.newBd;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class Practice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPractice;

    @Column(length = 20, nullable = false)
    private String numberPractice;

    @Column(length = 100, nullable = false)
    private String namePractice;

    @OneToOne
    @JoinColumn(name = "module_id", nullable = false)
    private ProfModule profModule;

    @OneToMany(mappedBy = "practice")
    @Column(nullable = false)
    private List<Schedule> schedules;

    @OneToMany(mappedBy = "practice")
    @Column(nullable = false)
    private List<PracticeInformation> practices;


    public Long getIdPractice() {
        return idPractice;
    }

    public void setIdPractice(Long idPractice) {
        this.idPractice = idPractice;
    }

    public String getNumberPractice() {
        return numberPractice;
    }

    public void setNumberPractice(String numberPractice) {
        this.numberPractice = numberPractice;
    }

    public String getNamePractice() {
        return namePractice;
    }

    public void setNamePractice(String namePractice) {
        this.namePractice = namePractice;
    }

    public ProfModule getProfModule() {
        return profModule;
    }

    public void setProfModule(ProfModule profModule) {
        this.profModule = profModule;
    }

    public List<Schedule> getSchedules() {
        return schedules;
    }

    public void setSchedules(List<Schedule> schedules) {
        this.schedules = schedules;
    }

    public Practice(Long idPractice, String namePractice, ProfModule profModule) {
        this.idPractice = idPractice;
        this.namePractice = namePractice;
        this.profModule = profModule;
    }

    public Practice() {

    }
}
