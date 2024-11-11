package com.exemple.composicao.entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

import com.exemple.composicao.enums.OrderStatus;

public class Order {

	private Client client;
	private LocalDateTime moment;
	private OrderStatus status;
	private List<OrderItem> itens;

	public Order() {

	}

	public Order(Client client, LocalDateTime moment, OrderStatus status, List<OrderItem> itens) {
		this.setClient(client);
		this.setMoment(moment);
		this.setStatus(status);
		this.setItens(itens);
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public LocalDateTime getMoment() {
		return moment;
	}

	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public List<OrderItem> getItens() {
		return itens;
	}

	public void setItens(List<OrderItem> itens) {
		this.itens = itens;
	}

	@Override
	public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        
		String msg = 
			      "ORDER SUMMARY:"	
				+ "\n	Order moment: %s"
				+ "\n	Order status: %s"
				+ "%s"
				+ "\nOrder items:"
				+ "%s"
				+ "\n	Total price: %.2f";

		return String.format(msg
				, this.getMoment().format(formatter)
				, this.getStatus()
				, this.getClient().toString()
		        , this.itens.stream().map(OrderItem::toString).collect(Collectors.joining(""))
				, this.getItens().stream().mapToDouble(item -> item.getSubTotal()).sum()
				);

	}
	
	public void mostrarInfo() {
		System.out.println( this.toString() );
	}

}
