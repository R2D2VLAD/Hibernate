package com.example.hibernate.model;

import javax.persistence.*;
import java.util.Objects;
@Entity
@Table(name = "emploee")
public class Emploee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "first_name", nullable = false, length = 50)
    private String firstname;
    @Basic
    @Column(name = "last_name", nullable = false, length = 50)
    private String lastname;
    @Basic
    @Column(name = "gender", nullable = false, length = 6)
    private String gender;
    @Basic
    @Column(name = "age", nullable = false)
    private int age;
    @Basic
    @Column(name = "city_id", nullable = false)
    private int cityId;

    public Emploee(int id, String firstname, String lastname, String gender, int age, int cityId) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.age = age;
        this.cityId = cityId;
    }

    public Emploee(String firstname, String lastname, String gender, int age, int city_id) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.age = age;
        this.cityId = city_id;
    }

    public Emploee() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Emploee)) return false;
        Emploee emploee = (Emploee) o;
        return age == emploee.age && firstname.equals(emploee.firstname) && lastname.equals(emploee.lastname) && gender.equals(emploee.gender) && cityId == emploee.cityId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname, gender, age, cityId);
    }

    @Override
    public String toString() {
        return "Emploee {" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", cityId=" + cityId +
                '}';
    }
}