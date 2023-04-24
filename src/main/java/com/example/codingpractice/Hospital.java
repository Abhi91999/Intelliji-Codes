package com.example.codingpractice;
class Doctor
{
    void doctorName(){
        System.out.println("Doctors name...");
    }
}

class SurgeonName extends Doctor{
    void SurgeonDetails(){
        System.out.println("Surgeon Details...");
    }
}

public class Hospital {
    public static void main(String[] args) {
        SurgeonName s = new SurgeonName();
        s.doctorName();
        s.SurgeonDetails();

    }
}
