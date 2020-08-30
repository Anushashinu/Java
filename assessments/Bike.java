package com.assessments;

public class Bike extends Vehicle {
	Bike(String reg , String nme, int m)
    {
    super(reg, nme, m);
    }
    void display()
    {
        System.out.println("two vechicle");
        super.display();
    }

}
