package com.example.MPTSait.model.newBd;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;

import java.util.List;

@Entity
@Table(name = "GroupStudent")
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idGroup;

    @Column(length = 20, nullable = false)
    @NotEmpty(message = "Отсутствует значение")
    private String nameGroup;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "course_id", nullable = false)
    private Course course;


    @OneToMany(mappedBy = "group")
    private List<Student> students;

    public Group() {

    }

    public Long getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(Long idGroup) {
        this.idGroup = idGroup;
    }

    public String getNameGroup() {
        return nameGroup;
    }

    public void setNameGroup(String nameGroup) {
        this.nameGroup = nameGroup;
    }


    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Group(String nameGroup, Course course) {
        this.nameGroup = nameGroup;
        this.course = course;
    }

    public Group(Course course) {
    }
}
