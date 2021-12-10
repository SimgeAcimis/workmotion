package com.backend.workmotion.entity;

import com.backend.workmotion.enums.EmployeeState;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "\"Employee\"" ,schema = "public")
public class Employee extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 5278802255307068340L;

    private String name;
    private int age;
    private double salary;
    private String title;
    private EmployeeState state;


    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @SequenceGenerator(name = "seq_id", sequenceName = "seq_id")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_id")
    public Long getId() {
        return id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "age")
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Column(name = "salary")
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "state")
    public EmployeeState getState() {
        return state;
    }

    public void setState(EmployeeState state) {
        this.state = state;
    }

}
