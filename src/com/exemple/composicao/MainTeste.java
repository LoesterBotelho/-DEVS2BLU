package com.exemple.composicao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
// import java.util.Scanner;

import com.exemple.composicao.entities.Client;
import com.exemple.composicao.entities.Order;
import com.exemple.composicao.entities.OrderItem;
import com.exemple.composicao.entities.Product;
import com.exemple.composicao.enums.OrderStatus;

public class MainTeste {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		// Scanner entrada = new Scanner(System.in);
		
		
		Client cliente = new Client("Alex Green", "alex@gmail.com", LocalDate.of(1985, 03, 15) );
	
		Product produto01TV = new Product("TV",1000.0);
		Product produto02Mouse = new Product("Mouse",40.0);

		OrderItem item01Pedido01 = new OrderItem(1, 1000.0, produto01TV);
		OrderItem item02Pedido01 = new OrderItem(2, 40.0, produto02Mouse);
		
		List<OrderItem> itens = new ArrayList<OrderItem>();
		itens.add(item01Pedido01);
		itens.add(item02Pedido01);
	              
		Order pedido01 = new Order(cliente , LocalDateTime.now() , OrderStatus.PROCESSING , itens);
		
		pedido01.mostrarInfo();
			
		// entrada.close();
			
	}
}
