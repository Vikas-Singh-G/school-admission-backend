package com.school.studentservice.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
  @NotBlank(message = "Name is required")
    private String name;

      @Email(message = "Invalid email format")
        @NotBlank(message = "Email is required")
    private String email;

    @Min(value = 3, message = "Age must be at least 3")
    @Max(value = 100, message = "Age must be less than or equal to 100")
    private int age;

    @NotBlank(message = "Gender is required")
    private String gender;

    @NotBlank(message="Class is required")
    private String className;

    // Constructors
    public Student() {}

    public Student(Long id, String name, String email, int age, String gender, String className) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.className= className;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getClassName() {
        return className;
    }
    
    public void setClassName(String className) {
        this.className = className;
    }
    

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
