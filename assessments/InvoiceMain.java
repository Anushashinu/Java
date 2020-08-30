package com.assessments;

public class InvoiceMain {
	public static void main(String[] args) {

		Invoice spanner = new Invoice("101", "A Spanner", 11, 16.8);
		Invoice hammer = new Invoice("101", "A Hammer", -1, -15.0);
		System.out.println(spanner.getPartNumber());
		System.out.println(spanner.getPartDescription());
		System.out.println(spanner.getQuantity());
		System.out.println(spanner.getUnitPrice());
		System.out.println(spanner.getInvoiceAmount());

		System.out.println(hammer.getPartNumber());
		System.out.println(hammer.getPartDescription());
		System.out.println(hammer.getQuantity());
		System.out.println(hammer.getUnitPrice());
		System.out.println(hammer.getInvoiceAmount());
		}

}
