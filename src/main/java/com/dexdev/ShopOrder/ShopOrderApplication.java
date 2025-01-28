package com.dexdev.ShopOrder;

import com.dexdev.ShopOrder.entities.Order;
import com.dexdev.ShopOrder.services.OrderService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class ShopOrderApplication implements CommandLineRunner {

	private OrderService orderService;

	public ShopOrderApplication(OrderService orderService) {
		this.orderService = orderService;
	}

	public static void main(String[] args) {
		SpringApplication.run(ShopOrderApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o código do pedido: ");
		int code = Integer.parseInt(scanner.nextLine());
		System.out.println("Digite o preço do pedido: ");
		double price = Double.parseDouble(scanner.nextLine());
		System.out.println("Digite o disconto do pedido: ");
		double discount = Double.parseDouble(scanner.nextLine());

		scanner.close();
		Order order = new Order(code, price, discount);

		System.out.println("Pedido feito com sucesso!");
		System.out.println("Código do pedido: " + order.getCode());
		System.out.println("Total a pagar: " + orderService.Total(order));
	}
}
