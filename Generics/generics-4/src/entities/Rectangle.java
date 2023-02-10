package entities;

public class Rectangle implements Shape {

	private double width;
	private double height;
	
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	

	public double getWidth() {
		return width;
	}

	public void setWidth(double weight) {
		this.width = weight;
	}

	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}



	@Override
	public double area() {
		return width * height;
	}

}
