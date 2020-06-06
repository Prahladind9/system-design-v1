package edu.prahlad.service;

public interface InventoryManagment {
	void createInventory();
	void checkoutInventory();
	void addInventory(String pItemName, double pPrice);
	void addCheckoutList(String pItemName, int itemCount, String pCustomerName);
	void updateInventory(String pItemName, int itemCount);
	void checkOutList(String pCustomerName);
	void generateReport(); 
	void clearUserInventory(); 
}
