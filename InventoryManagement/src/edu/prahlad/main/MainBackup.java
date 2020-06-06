package edu.prahlad.main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import edu.prahlad.dto.CheckOutListDTO;
import edu.prahlad.dto.InventoryListDTO;

/**
 * Main Method to implement 
 * 
 * @author prahlad.rao
 *
 */
public class MainBackup {

	private static List<InventoryListDTO> inventotyList;
	private static List<CheckOutListDTO> checkOutList;
	private static List<InventoryListDTO> outOfStockList = new ArrayList<>();
	private static int id;

	public static void main(String[] args) {
		
		

		createInventory(); // To create Inventory List
		addInventory("Pen", 10.0);
		addInventory("Pen", 11.0);
		addInventory("Pen", 12.0);
		addInventory("Pen", 13.0);
		addInventory("Pen", 14.0);

		addInventory("Eraser", 5.0);

		generateReport();

		checkoutInventory();
		addCheckoutList("Eraser", 1, "Hari");
		addCheckoutList("Eraser", 1, "Hari");

		checkOutList("Hari");

		clearUserInventory();

		addCheckoutList("Pen", 1, "Hari");
		addCheckoutList("Pen", 2, "Hari");

		addCheckoutList("Pen", 1, "Anjali");

		checkOutList("Anjali");

		generateReport();
		
		clearUserInventory();
	}

	/**
	 * To create an Inventory List
	 */
	public static void createInventory() {
		inventotyList = new ArrayList<>();
	}

	/**
	 * The checkout Inventory List
	 */
	public static void checkoutInventory() {
		checkOutList = new ArrayList<>();

	}

	/**
	 * Add an item to the Inventory List
	 */
	public static void addInventory(String pItemName, double pPrice) {
		++id;
		inventotyList.add(new InventoryListDTO(id, pItemName, pPrice));
	}

	/**
	 * Add an item to the Checkout Inventory List per user
	 */
	private static synchronized void addCheckoutList(String pItemName, int itemCount, String pCustomerName) {

		if (itemCount != 0) {

			if (inventotyList.stream().filter(t -> t.getName().equals(pItemName)).collect(Collectors.toList())
					.size() > 0) {

				if (inventotyList.stream().filter(t -> t.getName().equals(pItemName)).collect(Collectors.toList())
						.size() >= itemCount) {
					for (int k = 0; k < itemCount; k++) {
						checkOutList.add(new CheckOutListDTO(

								inventotyList.stream().filter(t -> t.getName().equals(pItemName))
										.collect(Collectors.toList()).get(k).getID(),
								inventotyList.stream().filter(t -> t.getName().equals(pItemName))
										.collect(Collectors.toList()).get(k).getName(),
								inventotyList.stream().filter(t -> t.getName().equals(pItemName))
										.collect(Collectors.toList()).get(k).getCost(),
								pCustomerName

						));
					}

					updateInventory(pItemName, itemCount);

				} else {
					System.out.println("The Please select less");
				}
			} else {
				System.out.println("The Item " + pItemName + "is out of stock, please try another item ");
				outOfStockList.add(new InventoryListDTO(0, pItemName, 0.0));
			}
		}

	}

	/**
	 * Update an Inventory List as per the stock availability
	 */
	private static void updateInventory(String pItemName, int itemCount) {

		for (int k = 0; k < itemCount; k++) {
			inventotyList.remove(inventotyList.stream().filter(t -> t.getName().equals(pItemName))
					.collect(Collectors.toList()).get(k));
		}
	}

	/**
	 * The Checkout list per customer as per the Customer
	 * 
	 * @param pCustomerName CustomerName
	 */
	public static void checkOutList(String pCustomerName) {
		System.err.println("Inventory Items list");
		checkOutList.stream().filter(t -> t.getCustomerName().equals(pCustomerName)).forEach(System.out::println);
		System.out.println("Amount to be Paid:: " + checkOutList.stream()
				.filter(t -> t.getCustomerName().equals(pCustomerName)).mapToDouble(CheckOutListDTO::getCost).sum());
	}

	/**
	 * Generate the report 
	 */
	public static void generateReport() {
		System.err.println("Inventory Items list");
		inventotyList.forEach(System.out::println);

		for (String itemList : inventotyList.stream().map(InventoryListDTO::getName).distinct()
				.collect(Collectors.toList())) {
			System.out.println(itemList + " Item List "
					+ inventotyList.stream().filter(t -> t.getName().equals(itemList)).count());
		}

		System.err.println("Out of Stock Item List");
		outOfStockList.forEach(System.out::println);
	}

	public static void clearUserInventory() {
		checkOutList.clear();
	}

}
