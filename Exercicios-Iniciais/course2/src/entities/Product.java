package entities;

public class Product {
	
	private String name;
	private double price;
	private int quantity;
	
	public Product() { // Também é possível manter a opção do construtor padrão
		
	}
	
	public Product(String name, double price, int quantity) { // Construtor  
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price) { // Outro Construtor, isso é possível através da sobrecarga  
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQuantity () {
		return quantity;
	}
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity; // esse this.quantity se referencia ao atributo quantity da classe
	}
	
	public void removeProducts (int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() { // Sobreposição do método toString herdado da classe Object
		return name 
			+ ", $ " 
			+ String.format("%.2f", price) 
			+ ", " 
			+ quantity 
			+ " units, Total: $ " 
			+ String.format("%.2f", totalValueInStock());
	}

}
