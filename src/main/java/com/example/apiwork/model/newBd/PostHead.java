package com.example.apiwork.model.newBd;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class PostHead {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPost;

    @Column(length = 100, nullable = false)
    private String namePost;

    @JsonIgnore
    @OneToMany(mappedBy = "postHead")
    @Column(nullable = false)
    private List<Employee> employees;



    public PostHead() {

    }

    public Long getIdPost() {
        return idPost;
    }

    public void setIdPost(Long idPost) {
        this.idPost = idPost;
    }

    public String getNamePost() {
        return namePost;
    }

    public void setNamePost(String namePost) {
        this.namePost = namePost;
    }

    public PostHead(String namePost) {
        this.namePost = namePost;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
