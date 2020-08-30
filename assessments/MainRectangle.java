package com.assessments;

import java.awt.Rectangle;

public class MainRectangle {
public static void main(String[] args) {
	

	 

	 RectangleAreaPer re = new RectangleAreaPer(12, 10);

	 System.out.println("Area and perimeter of new rectangle");

	 displayRectData(re);
	 
	 re = new RectangleAreaPer();
	 System.out.println("Area and perimeter of new rectangle");

	 displayRectData(re);

	 }

	 public static void displayRectData(RectangleAreaPer r) {

	 System.out.println("Current Dimensions:\n "+ r);

	 System.out.printf("Area of Rectangle: %.2f\nPerimeter of Rectangle: %.2f\n\n",

	 r.computeArea(), r.computePerimeter());

	 }
}
