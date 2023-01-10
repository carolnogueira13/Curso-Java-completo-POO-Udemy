package entities;

public class Triangle {
	
	public double a; // Atributos
	public double b;
	public double c;
	
	public double area() { // Método
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
		
	}

}
