package com.example.MPTSait.model.newBd;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idStud;

    @Column(length = 20, nullable = false)
    //@NotEmpty(message = "Отсутствует значение")
    private String nameStudent;

    @Column(length = 20, nullable = false)
    //@NotEmpty(message = "Отсутствует значение")
    private String lastnameStudent;

    @Column(length = 20)
    private String surnameStudent;

    @Column(length = 50, nullable = false)
    //@NotEmpty(message = "Отсутствует значение")
    private String numberPhoneStudent;

    @Column(length = 50, nullable = false, unique = true)
    //@NotEmpty(message = "Отсутствует значение")
    private String emailStudent;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "group_id")
    private Group group;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL, orphanRemoval = true)
    @Column(nullable = false)
    private List<PracticeInformation> practices;

    private Integer isAdd;

    public List<PracticeInformation> getPractices() {
        return practices;
    }

    public void setPractices(List<PracticeInformation> practices) {
        this.practices = practices;
    }

    public Long getIdStud() {
        return idStud;
    }

    public void setIdStud(Long idStud) {
        this.idStud = idStud;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getLastnameStudent() {
        return lastnameStudent;
    }

    public void setLastnameStudent(String lastnameStudent) {
        this.lastnameStudent = lastnameStudent;
    }

    public String getSurnameStudent() {
        return surnameStudent;
    }

    public void setSurnameStudent(String surnameStudent) {
        this.surnameStudent = surnameStudent;
    }

    public String getNumberPhoneStudent() {
        return numberPhoneStudent;
    }

    public void setNumberPhoneStudent(String numberPhoneStudent) {
        this.numberPhoneStudent = numberPhoneStudent;
    }

    public String getEmailStudent() {
        return emailStudent;
    }

    public void setEmailStudent(String emailStudent) {
        this.emailStudent = emailStudent;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Integer getIsAdd() {
        return isAdd;
    }

    public void setIsAdd(Integer isAdd) {
        this.isAdd = isAdd;
    }

    public Student(String nameStudent, String lastnameStudent, String surnameStudent, String numberPhoneStudent, String emailStudent, Group group, Integer isAdd) {
        this.nameStudent = nameStudent;
        this.lastnameStudent = lastnameStudent;
        this.surnameStudent = surnameStudent;
        this.numberPhoneStudent = numberPhoneStudent;
        this.emailStudent = emailStudent;
        this.group = group;
        this.isAdd = isAdd;
    }

    public Student() {

    }
}
