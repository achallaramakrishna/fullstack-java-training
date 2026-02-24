package firstproj;

// server code
public class Circle {
	
	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return (Math.PI * this.radius * this.radius);
	}
	
	public double getPerimeter() {
		return (2 * Math.PI * this.radius);
	}

}
