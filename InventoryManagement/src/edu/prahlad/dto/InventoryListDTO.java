package edu.prahlad.dto;

public class InventoryListDTO {
	
	private int ID;
	private String name;
	private double cost;
	
	public InventoryListDTO(int iD, String name, double cost) {
		super();
		ID = iD;
		this.name = name;
		this.cost = cost;
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
	@Override
	public String toString() {
		return "[ID=" + ID + ", name=" + name + ", cost=" + cost + "]";
	}
	
	
	
}
