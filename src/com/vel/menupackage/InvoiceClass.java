package com.vel.menupackage;

import java.util.Date;

public class InvoiceClass {
	int kota = 1, qty, subtotal, totalitem;
	float gstvalue;
	static int k = 0;
	String itemname[] = new String[9];
	int itemqty[] = new int[9];
	int itemprice[] = new int[9];

	public void hotelDetails() {
		System.out.println("\tUpsouth Wakkad");
		System.out.println("\t  HK Venture ");
		System.out.println("Bliss Society, Near Datta Mand");
		System.out.println(" Wakkad - Thergaon Road Wakkad");
		System.out.println(" PCMC, Pune : - 411057");
		System.out.println("----------------------------------------------");
		System.out.println(" Type : - Dine In");
		System.out.println("----------------------------------------------");
		System.out.println(" Bill no : - " + Math.random());
		System.out.println(" Delivery Boy :");
		Date d = new Date();
		System.out.println(" Date : " + d);
		System.out.println(" Kota " + kota);
		System.out.println("----------------------------------------------");
		System.out.println("Customer Details");
		System.out.println("==================");
		System.out.println("Name : Suraj Pethe");
		System.out.println("Phone : +91 8552882856");
		System.out.println("----------------------------------------------");
		System.out.println(" Items \t\t" + "	Qty\t\t" + "Amt");
		System.out.println("----------------------------------------------");
	}

	public void printItems(int limit) {
		for (int i = 0; i < limit; i++) {
			System.out.print(" " + itemname[i]);
			System.out.print("\t\t " + itemqty[i]);
			System.out.print("\t\t" + itemprice[i]);
			System.out.println();
		}
	}

	public void getSubTotal() {
		System.out.println("----------------------------------------------");
		for (int i = 0; i < itemqty.length; i++) {
			totalitem = totalitem + itemqty[i];
		}
		
		for (int i = 0; i < itemprice.length; i++) {
			subtotal = subtotal + itemprice[i];
		}
		
		System.out.println(" Total QTY : \t\t " + totalitem);
		System.out.println(" Sub Total : \t\t\t\t" + subtotal);
		System.out.println("----------------------------------------------");
	}

	public void getGSTDetails() {
		gstvalue = (subtotal * 5) / 100;
		System.out.println(" GST @5%\t\t\t\t" + (float) (subtotal * 5) / 100);
		System.out.println(" GST @2.5%\t\t" + (float) (subtotal * 2.5) / 100);
		System.out.println(" GST @2%\t\t" + (float) (subtotal * 2.5) / 100);
		System.out.println("===============================================");
		System.out.print(" Grand Total\t\t\t\t");
		System.out.print(gstvalue + subtotal);
		System.out.println();
		System.out.println("----------------------------------------------");
	}

	public void footerDetails() {
		System.out.println(" GST No : - 27AADCU0160B1ZW");
		System.out.println();
		System.out.println("\t\t Thank you, Visit Again");
	}

}
