package com.fruitcart.model;

public class Fruits 
{
	@Override
	public String toString() {
		return "Fruits [id=" + id + ", items=" + items + ", quantity=" + quantity + ", price=" + price + "]";
	}
	private int id;
	private String items;
	private int quantity;
	private float price;
	
	
	public Fruits(int id, String items, int quantity, float price) 
	{
		super();
		this.id = id;
		this.items = items;
		this.quantity = quantity;
		this.price = price;
	}
	
	public Fruits(String items, int quantity, float price) 
	{
		super();
		this.items = items;
		this.quantity = quantity;
		this.price = price;
	}

	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getItems()
	{
		return items;
	}
	public void setItems(String items) 
	{
		this.items = items;
	}
	public int getQuantity() 
	{
		return quantity;
	}
	public void setQuantity(int quantity) 
	{
		this.quantity = quantity;
	}
	public float getPrice() 
	{
		return price;
	}
	public void setPrice(float price) 
	{
		this.price = price;
	}
	
}
