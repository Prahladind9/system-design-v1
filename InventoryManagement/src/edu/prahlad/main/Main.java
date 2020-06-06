package edu.prahlad.main;

import edu.prahlad.implementation.InventoryManagmentImp;

/**
 * Main Method to implement 
 * 
 * @author prahlad.rao
 *
 */
public class Main {

	public static void main(String[] args) {
		
		
		InventoryManagmentImp im = new InventoryManagmentImp();
		
		im.addInventory("Pen", 10.0);
		im.addInventory("Pen", 11.0);
		im.addInventory("Pen", 12.0);
		im.addInventory("Pen", 13.0);
		im.addInventory("Pen", 14.0);
		im.addInventory("Eraser", 5.0);

		System.out.println("\n\nExpected output " + "[ID=1, name=Pen, cost=10.0]\r\n" + 
				"[ID=2, name=Pen, cost=11.0]\r\n" + 
				"[ID=3, name=Pen, cost=12.0]\r\n" + 
				"[ID=4, name=Pen, cost=13.0]\r\n" + 
				"[ID=5, name=Pen, cost=14.0]\r\n" + 
				"[ID=6, name=Eraser, cost=5.0]\r\n" + 
				 "Pen Item List 5\r\n" + "Eraser Item List 1" 
				);
		System.out.println("\nActual output ");
		im.generateReport();

		System.out.println("\nCheckoutInventory Created ");
		im.checkoutInventory();
		im.addCheckoutList("Eraser", 1, "Hari");
		
		System.out.println("Expected outupt: The Item Eraser is out of stock, please try another item ");
		System.out.println("\nActual output  ");
		im.addCheckoutList("Eraser", 1, "Hari");
		
		
		im.addCheckoutList("Pen", 1, "Hari");
		im.addCheckoutList("Pen", 2, "Hari");
		
		System.out.println("\n\nExpected output for Hari \r\n"+ 
				"checkOutListDTO [ID=6, name=Eraser, cost=5.0, customerName=Hari]\r\n" + 
				"checkOutListDTO [ID=1, name=Pen, cost=10.0, customerName=Hari]\r\n" + 
				"checkOutListDTO [ID=2, name=Pen, cost=11.0, customerName=Hari]\r\n" + 
				"checkOutListDTO [ID=3, name=Pen, cost=12.0, customerName=Hari]\r\n" + 
				"Amount to be Paid:: 38.0");
		System.out.println("\nActual output  ");
		im.checkOutList("Hari");
		
		
		im.addCheckoutList("Pen", 1, "Anjali");
		System.out.println("\n\nExpected output for Anjali\r\n" + 
				"checkOutListDTO [ID=3, name=Pen, cost=12.0, customerName=Anjali]\r\n" + 
				"Amount to be Paid:: 12.0");
		System.out.println("\nActual output ");
		
		im.checkOutList("Anjali");

		System.out.println("\n\n");
		im.generateReport();
		
		im.clearUserInventory();
	}

	

	

}
