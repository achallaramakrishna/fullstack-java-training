package firstproj;

// client code
public class CircleProgram {

	public static void main(String[] args) {
		
		Circle circle = new Circle();
		circle.setRadius(5);
		System.out.println("Area - " + circle.getArea());
		System.out.println("Perimeter - " + circle.getPerimeter());

	}

}
