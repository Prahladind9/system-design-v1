package edu.prahlad.dto;

public class CheckOutListDTO {
	
	private int ID;
	private String name;
	private double cost;
	private String customerName;
	
	public CheckOutListDTO(int iD, String name, double cost, String customerName) {
		super();
		ID = iD;
		this.name = name;
		this.cost = cost;
		this.customerName = customerName;
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	@Override
	public String toString() {
		return "checkOutListDTO [ID=" + ID + ", name=" + name + ", cost=" + cost + ", customerName=" + customerName
				+ "]";
	}
	
	
	
	
	
}
