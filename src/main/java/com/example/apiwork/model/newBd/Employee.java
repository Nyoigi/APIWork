package com.example.apiwork.model.newBd;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmployee;

    @Column(length = 20)
    private String login;
    @Column(length = 20)
    private String password;

    @Column(length = 20, nullable = false)
    private String nameEmployee;
    @Column(length = 20)
    private String surnameEmployee;
    @Column(length = 20, nullable = false)
    private String lastnameEmployee;

    @Column(length = 50, nullable = false)
    private String numberPhone;
    @Column(length = 50, nullable = false)
    private String email;

    @JsonIgnore
    @OneToMany(mappedBy = "employee")
    @Column(nullable = false)
    private List<PracticeInformation> practices;



    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "postHeadId", nullable = false)
    private PostHead postHead;

    public Employee() {

    }

    public List<PracticeInformation> getPractices() {
        return practices;
    }

    public void setPractices(List<PracticeInformation> practices) {
        this.practices = practices;
    }

    public Long getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(Long idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public String getSurnameEmployee() {
        return surnameEmployee;
    }

    public void setSurnameEmployee(String surnameEmployee) {
        this.surnameEmployee = surnameEmployee;
    }

    public String getLastnameEmployee() {
        return lastnameEmployee;
    }

    public void setLastnameEmployee(String lastnameEmployee) {
        this.lastnameEmployee = lastnameEmployee;
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

    public PostHead getPostHead() {
        return postHead;
    }

    public void setPostHead(PostHead postHead) {
        this.postHead = postHead;
    }


    public Employee(String nameEmployee, String surnameEmployee, String lastnameEmployee,
                    String numberPhone, String email, PostHead postHead) {
        this.nameEmployee = nameEmployee;
        this.surnameEmployee = surnameEmployee;
        this.lastnameEmployee = lastnameEmployee;
        this.numberPhone = numberPhone;
        this.email = email;
        this.postHead = postHead;
    }
}
