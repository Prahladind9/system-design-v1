package edu.prahlad.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import edu.prahlad.dto.CheckOutListDTO;
import edu.prahlad.dto.InventoryListDTO;
import edu.prahlad.service.InventoryManagment;

public class InventoryManagmentImp implements InventoryManagment {

	private List<InventoryListDTO> inventotyList;
	private List<CheckOutListDTO> checkOutList;
	private List<InventoryListDTO> outOfStockList = new ArrayList<>();
	private static int id;
	
	
	public InventoryManagmentImp() {
		createInventory(); 
		checkoutInventory();
	}
	
	
	/**
	 * To create an Inventory List
	 */
	public void createInventory() {
		inventotyList = new ArrayList<>();
	}

	/**
	 * The checkout Inventory List
	 */
	public  void checkoutInventory() {
		checkOutList = new ArrayList<>();

	}
	
	/**
	 * Add an item to the Inventory List
	 */
	public void addInventory(String pItemName, double pPrice) {
		++id;
		inventotyList.add(new InventoryListDTO(id, pItemName, pPrice));
	}

	/**
	 * Add an item to the Checkout Inventory List per user
	 */
	public void addCheckoutList(String pItemName, int itemCount, String pCustomerName) {

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
				System.out.println("The Item " + pItemName + " is out of stock, please try another item ");
				outOfStockList.add(new InventoryListDTO(0, pItemName, 0.0));
			}
		}

	}

	/**
	 * Update an Inventory List as per the stock availability
	 */
	public void updateInventory(String pItemName, int itemCount) {

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
	public  void checkOutList(String pCustomerName) {
		System.err.println("Inventory Items list");
		checkOutList.stream().filter(t -> t.getCustomerName().equals(pCustomerName)).forEach(System.out::println);
		System.out.println("Amount to be Paid:: " + checkOutList.stream()
				.filter(t -> t.getCustomerName().equals(pCustomerName)).mapToDouble(CheckOutListDTO::getCost).sum());
	}

	/**
	 * Generate the report 
	 */
	public  void generateReport() {
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

	public  void clearUserInventory() {
		checkOutList.clear();
	}
	
	
}
