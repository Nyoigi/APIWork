package com.example.apiwork.model.newBd;

import jakarta.persistence.*;

@Entity
public class PracticeInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "practice_id")
    private Practice practice;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "employeeOrg_id")
    private HeadOrganization headOrganization;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Practice getPractice() {
        return practice;
    }

    public void setPractice(Practice practice) {
        this.practice = practice;
    }

    public HeadOrganization getHeadOrganization() {
        return headOrganization;
    }

    public void setHeadOrganization(HeadOrganization headOrganization) {
        this.headOrganization = headOrganization;
    }

    public PracticeInformation(Student student, Employee employee, Practice practice, HeadOrganization headOrganization) {
        this.student = student;
        this.employee = employee;
        this.practice = practice;
        this.headOrganization = headOrganization;
    }


    public PracticeInformation() {

    }
}
