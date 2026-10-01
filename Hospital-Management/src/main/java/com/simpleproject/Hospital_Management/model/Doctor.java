package com.simpleproject.Hospital_Management.model;

public class Doctor {
    
    private int Id;
    private String Name;
    private String Gender;
    private String Email;
    private String Specialization;
    private String DOB;



    public int getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getGender() {
        return Gender;
    }
    public void setGender(String gender) {
        Gender = gender;
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        Email = email;
    }
    public String getSpecialization() {
        return Specialization;
    }
    public void setSpecialization(String specialization) {
        Specialization = specialization;
    }
    public String getDOB() {
        return DOB;
    }
    public void setDOB(String dOB) {
        DOB = dOB;
    }

    
    @Override
    public String toString() {
        return "Doctor [Id=" + Id + ", Name=" + Name + ", Gender=" + Gender + ", Email=" + Email + ", Specialization="
                + Specialization + ", DOB=" + DOB + ", getName()=" + getName() + ", getGender()=" + getGender()
                + ", getEmail()=" + getEmail() + ", getSpecialization()=" + getSpecialization() + ", getDOB()="
                + getDOB() + "]";
    }

    
}
