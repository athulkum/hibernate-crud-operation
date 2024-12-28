package com.model;

import javax.persistence.*;

@Entity
@Table(name = "hibernate")
public class Student {

    @Id
    @GeneratedValue
    private  int id;

    @Column(name = "student_marks")
    private double marks;

    @Column(name = "student_name")
    private String name;


    public  Student(){
        super();
    }

    public Student(double marks, String name) {
        this.marks = marks;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
