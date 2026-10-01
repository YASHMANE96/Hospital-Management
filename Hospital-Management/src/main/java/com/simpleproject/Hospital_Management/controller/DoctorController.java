package com.simpleproject.Hospital_Management.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simpleproject.Hospital_Management.model.Doctor;

@RestController
@RequestMapping("/doctor/apis")
public class DoctorController {
    
    //Using HashMap to Store the Data in  Memory
    Map<Integer, Object> DoctorDataBase = new HashMap<>();

    //Debugging :- Tracing the flow of the application(Understanding line by line What is Happening And All)
    //SpringBoot Application :- Takes Input In the Form of JSON(JavaScript Object Notation)


    //@RequestBody :- It Takes the Input From Postman or UI And Assigns it to Object(Used For Complete Class Objects) 
    @PostMapping("/save")
    public String SaveDoctor(@RequestBody Doctor doctor){

        DoctorDataBase.put(doctor.getId(), doctor);
        System.out.println("Doctor Saved : " + DoctorDataBase);
        return "Doctor Saved Successfully!";
    }

    //@PathVariable :- It Takes the Input in the URL Path And Endpoint
    @GetMapping("/find/{id}")
    public Doctor GetDoctorById(@PathVariable int id) {
        Doctor doctor = (Doctor) DoctorDataBase.get(id);
        return doctor;
    } 


    @GetMapping("/findAll")
    public Map<Integer, Object> GetAllDoctors(){
        return DoctorDataBase;
    }

    @DeleteMapping("/delete/{id}")
    public String DeleteDoctorById(@PathVariable int id){
        DoctorDataBase.remove(id);
        return "Doctor Removed Successfully!";
    }
}
