package com.assessments;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 =  new Employee();
        
        e1.setfname("Anusha");
        e1.setlname("Shinu");
        e2.setfname("Hridhaan");
        e2.setlname("S");
        e1.setsalary(23000);
        e2.setsalary(45000);
        System.out.println("monthly salary = " +e1.fname  +e1.lname  +e1.getsalary());
        System.out.println("monthly salary = " +e2.fname  +e2.lname  +e2.getsalary());
        System.out.println("yearly salary");
        System.out.println("yearly salary = " +e1.fname  +e1.lname  +e1.getsalary()*12);
        System.out.println("yearly salary = " +e2.fname  +e2.lname  +e2.getsalary()*12);
        System.out.println("yearly salary raise 10%");
        System.out.println("yearly salary = " +e1.fname  +e1.lname  +e1.getsalary()*1.1*12);
        System.out.println("yearly salary = " +e2.fname  +e2.lname  +e2.getsalary()*1.1*12);

 

    }

}
