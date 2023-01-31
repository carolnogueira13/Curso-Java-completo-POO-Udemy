package application;

import java.util.ArrayList;
import java.util.List;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

public class Program {

	public static void main(String[] args) {
		
		List<Shape> myShape = new ArrayList<>();
		myShape.add(new Rectangle(3.0, 2.0));
		myShape.add(new Circle(2.0));
		
		System.out.println("Total area: " + totalArea(myShape));
		
		List<Circle> myCircles = new ArrayList<>();
		myCircles.add(new Circle(2.0));
		myCircles.add(new Circle(3.0));
		
		System.out.println("Total area: " + totalArea(myCircles));
	
	}
	
	public static double totalArea(List<? extends Shape> list) { // Essa lista pode ser de Shape e de qualquer tipo que extends Shape( nessa caso Circle e Rectangle)
		double sum = 0.0;
		for (Shape s: list) {
			sum += s.area(); 
		}
		return sum;
	}

}
