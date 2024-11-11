package com.exemple.composicao.entities;

public class OrderItem {

	private double quantity;
	private double price;
	private Product product;
	
	public OrderItem(double quantity, double price, Product product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	public double getSubTotal() {
		return price * quantity;
	}

	@Override
	public String toString() {		
		String msg = "\n	%s, %s, Quantity: %.2f, Subtotal: %.2f";
		
		return String.format(msg
				, this.getProduct().getName()
				, this.getPrice()
				, this.getQuantity()
				, this.getSubTotal()
				);		
	}
	
	
}
