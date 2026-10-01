package com.simpleproject.Hospital_Management.model;

public class Patient {
    
    private int Id;
    private String Name;
    private String Age;
    private String MobileNO;
    private String Address;
    private String DiagnosedWith;
    private String BloodGroup;
    private String AdmitDate;


    
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
    public String getAge() {
        return Age;
    }
    public void setAge(String age) {
        Age = age;
    }
    public String getMobileNO() {
        return MobileNO;
    }
    public void setMobileNO(String mobileNO) {
        MobileNO = mobileNO;
    }
    public String getAddress() {
        return Address;
    }
    public void setAddress(String address) {
        Address = address;
    }
    public String getDiagnosedWith() {
        return DiagnosedWith;
    }
    public void setDiagnosedWith(String diagnosedWith) {
        DiagnosedWith = diagnosedWith;
    }
    public String getBloodGroup() {
        return BloodGroup;
    }
    public void setBloodGroup(String bloodGroup) {
        BloodGroup = bloodGroup;
    }
    public String getAdmitDate() {
        return AdmitDate;
    }
    public void setAdmitDate(String admitDate) {
        AdmitDate = admitDate;
    }

    
}
