package com.assessments;

import java.util.Scanner;

public class SalaryMain {
	public static void main(String[] args) {
		String name;
		int hrs;
		double sal;
		int extrahrs;
		double rte;
		Salary sc = new Salary();
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the employee name");
		name = scan.next();
		sc.setEmployeename(name);

		System.out.println("enter the hours");
		hrs = scan.nextInt();
		sc.setHours(hrs);

		System.out.println("enter the rate");
		rte = scan.nextDouble();
		sc.setRate(rte);
		sc.pay(hrs, rte);
		sc.displayemployee();
		}

}
