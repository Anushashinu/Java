package com.assessments;

public class Car extends Vehicle {
	Car(String reg , String nme, int m )
    {
        super(reg, nme, m);
        
    }
    void display()
    {
    System.out.println("the car is");
    super.display();
    
    }

}
