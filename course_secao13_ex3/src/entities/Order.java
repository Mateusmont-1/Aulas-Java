package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	private LocalDateTime moment;
	private OrderStatus status;
	private Client client;
	
	private List<OrderItem> orderItems = new ArrayList<>();
	private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	
	public Order() {
	}

	public Order(LocalDateTime moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
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

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getOrderItem() {
		return orderItems;
	}
	
	public void addItem(OrderItem orderItem) {
		orderItems.add(orderItem);
	}
	
	public void removeItem(OrderItem orderItem) {
		orderItems.remove(orderItem);
	}
	
	public Double total() {
		double sum = 0.0;
		for(OrderItem o : orderItems) {
			sum += o.subTotal();
		}
		return sum;
	}
	
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMMARY:\n");
		sb.append("Order moment:" + moment.format(dtf)+"\n");
		sb.append("Order status: " + status+"\n");
		sb.append("Client: ");
		sb.append(client.getName() + " ");
		sb.append("(" + client.getBirthDate() + ") - ");
		sb.append(client.getEmail() + "\n");
		sb.append("Order items:\n");
		
		for(OrderItem o : orderItems) {
			sb.append(o.getProduct().getName() + ", $");
			sb.append(o.getProduct().getPrice() + ", ");
			sb.append("Quantity: " + o.getQuantity() + ", ");
			sb.append("Subtotal: " + o.subTotal() + "\n");
		}
		sb.append("Total price: " + total());
		return sb.toString();
	}
}
