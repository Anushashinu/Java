package com.assessments;

public class Vehicle {
	String regno;
	String name;
	int model;

	 

	Vehicle(String reg , String nme, int m )
	{
	    regno = reg;
	    name = nme;
	    model = m;
	}
	void display()
	{
	    System.out.println("Reg no:"  +regno);
	    System.out.println(model);
	    System.out.println(name);
	}

	 

	}


