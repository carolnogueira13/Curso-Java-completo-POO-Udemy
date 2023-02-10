package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	private static DateTimeFormatter mf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	private static DateTimeFormatter mf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public LocalDateTime moment;
	public OrderStatus status;
	
	private Client client;
	private List<OrderItem> ordemItem = new ArrayList<>();
	
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

	public List<OrderItem> getOrdemItem() {
		return ordemItem;
	}

	public void addItem(OrderItem item) {
		ordemItem.add(item);
	}
	
	public void removeItem(OrderItem item) {
		ordemItem.remove(item);
	}
	
	public Double total() {
		Double sum = 0.0;
		for (OrderItem item: ordemItem) {
			sum += item.subTotal();			
		}
		return sum;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: " + mf1.format(moment) + "\n");
		sb.append("Order Status: " + status + "\n");
		sb.append("Client: " + client.getName());
		sb.append(" (" + mf2.format(client.getBirthDate()) + ")");
		sb.append(" - " + client.getEmail() + "\n");
		sb.append("Order itens:\n");
		for (OrderItem item: ordemItem) {
			sb.append(item + "\n");
		}
		sb.append("Total Price: $" + String.format("%.2f", total()));
		return sb.toString();
	}
	
	
	
	
	

}
