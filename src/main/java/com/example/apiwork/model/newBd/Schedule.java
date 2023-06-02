package com.example.MPTSait.model.newBd;


import jakarta.persistence.*;

import java.sql.Date;

@Entity
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date startPractice;

    private Date endPractice;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "practice_id", nullable = false)
    private Practice practice;

    public Schedule() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getStartPractice() {
        return startPractice;
    }

    public void setStartPractice(Date startPractice) {
        this.startPractice = startPractice;
    }

    public Date getEndPractice() {
        return endPractice;
    }

    public void setEndPractice(Date endPractice) {
        this.endPractice = endPractice;
    }

    public Practice getPractice() {
        return practice;
    }

    public void setPractice(Practice practice) {
        this.practice = practice;
    }

    public Schedule(Date startPractice, Date endPractice, Practice practice) {
        this.startPractice = startPractice;
        this.endPractice = endPractice;
        this.practice = practice;
    }
}
