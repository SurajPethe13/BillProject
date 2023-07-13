package com.vel.menupackage;

import java.util.Scanner;

public class MenuClass extends InvoiceClass {

	public void selectItems() {
		
		System.out.println(" Welcome To Upsouth Wakkad Snacks Center");
		System.out.println();
		System.out.println("1. Vada Pav     - Rs. 10 \t 2. Samosa Pav - Rs. 20 \t 3. Bhajiya (Onion, Potato, Palak) - Rs. 30");
		System.out.println("4. Misal Pav    - Rs. 40 \t 5. Puri Bhaji - Rs. 50 \t 6. Bread Patties (Bread Pakoda) - Rs. 60");
		System.out.println("7. Dahi Kachori - Rs. 70 \t 8. jalebi     - Rs. 80 \t 9. Dhokla - Rs. 90");
		System.out.println();
		System.out.println("Please Select How Many Items You Want to Buy");
		
		Scanner scan = new Scanner(System.in);
		int limit = scan.nextInt();
		
		for (int i = 1; i <= limit; i++) {
			System.out.println("Please Enter the Items no to Add into the Cart");
			int item = scan.nextInt();
			switch (item) {

			case 1:
				System.out.println("You Selected Vada Pav");
				System.out.println("Please Enter the QTY of Vada Pav");
				qty = scan.nextInt();
				itemname[k] = "Vada Pav";
				itemqty[k] = qty;
				itemprice[k] = qty * 10;
				break;

			case 2:
				System.out.println("You Selected Samosa Pav");
				System.out.println("Please Enter the QTY of Samosa Pav");
				qty = scan.nextInt();
				itemname[k] = "Samosa Pav";
				itemqty[k] = qty;
				itemprice[k] = qty * 20;
				break;

			case 3:
				System.out.println("You Selected Bhajiya Pav");
				System.out.println("Please Enter the QTY of Bhajiya Pav");
				qty = scan.nextInt();
				itemname[k] = "Bhajiya Pav";
				itemqty[k] = qty;
				itemprice[k] = qty * 30;
				break;

			case 4:
				System.out.println("You Selected Misal Pav");
				System.out.println("Please Enter the QTY of Misal Pav");
				qty = scan.nextInt();
				itemname[k] = "Misal Pav";
				itemqty[k] = qty;
				itemprice[k] = qty * 40;
				break;

			case 5:
				System.out.println("You Selected Puri Bhaji");
				System.out.println("Please Enter the QTY of Puri Bhaji");
				qty = scan.nextInt();
				itemname[k] = "Puri Bhaji";
				itemqty[k] = qty;
				itemprice[k] = qty * 50;
				break;

			case 6:
				System.out.println("You Selected Bread Patties");
				System.out.println("Please Enter the QTY of Bread Patties");
				qty = scan.nextInt();
				itemname[k] = "Bread Patties";
				itemqty[k] = qty;
				itemprice[k] = qty * 60;
				break;

			case 7:
				System.out.println("You Selected Dahi Kachori");
				System.out.println("Please Enter the QTY of Dahi Kachori");
				qty = scan.nextInt();
				itemname[k] = "Dahi Kachori";
				itemqty[k] = qty;
				itemprice[k] = qty * 70;
				break;

			case 8:
				System.out.println("You Selected Jalebi");
				System.out.println("Please Enter the QTY of Jalebi");
				qty = scan.nextInt();
				itemname[k] = "Jalebi";
				itemqty[k] = qty;
				itemprice[k] = qty * 80;
				break;

			case 9:
				System.out.println("You Selected Dhokla");
				System.out.println("Please Enter the QTY of Dhokla");
				qty = scan.nextInt();
				itemname[k] = "Dhokla";
				itemqty[k] = qty;
				itemprice[k] = qty * 90;
				break;

			default:
				System.out.println("Please select valid Item no");
			}
			k++;
		}
		
		System.out.println("Do you Want to Add More Items");
		System.out.println("Press (Y) for Yes / (N) for No");
		char s = scan.next().charAt(0);
		
		if (s == 'y' || s == 'Y') {
			selectItems();
			kota++;
		} else if (s == 'n' || s == 'N') {
			System.out.println("Thank you for Ordering...!");
			System.out.println("Please Check Your Invoice");
			System.out.println();
			System.out.println();
		} else {
			System.out.println("Please Enter (Y) or (N)");
		}
	}

}
