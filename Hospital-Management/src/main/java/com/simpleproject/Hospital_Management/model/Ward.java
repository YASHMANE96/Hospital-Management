package com.simpleproject.Hospital_Management.model;

public class Ward {
    
    private int Ward_No;
    private String Ward_Type;
    private String Number_Of_Beds;
    private String Number_Of_Patients;
    private String Occupied_Beds;
    private String Unoccupied_Beds;



    public int getWard_No() {
        return Ward_No;
    }
    public void setWard_No(int ward_No) {
        Ward_No = ward_No;
    }
    public String getWard_Type() {
        return Ward_Type;
    }
    public void setWard_Type(String ward_Type) {
        Ward_Type = ward_Type;
    }
    public String getNumber_Of_Beds() {
        return Number_Of_Beds;
    }
    public void setNumber_Of_Beds(String number_Of_Beds) {
        Number_Of_Beds = number_Of_Beds;
    }
    public String getNumber_Of_Patients() {
        return Number_Of_Patients;
    }
    public void setNumber_Of_Patients(String number_Of_Patients) {
        Number_Of_Patients = number_Of_Patients;
    }
    public String getOccupied_Beds() {
        return Occupied_Beds;
    }
    public void setOccupied_Beds(String occupied_Beds) {
        Occupied_Beds = occupied_Beds;
    }
    public String getUnoccupied_Beds() {
        return Unoccupied_Beds;
    }
    public void setUnoccupied_Beds(String unoccupied_Beds) {
        Unoccupied_Beds = unoccupied_Beds;
    }

    
}
