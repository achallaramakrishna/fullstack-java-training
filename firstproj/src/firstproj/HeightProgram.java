package firstproj;

public class HeightProgram {

	public static void main(String[] args) {
		
		Height h1 = new Height(5,8);
		Height h2 = new Height(5,9);
		Height h3 = new Height(5,7);
		
		Height h5 = new Height(h3); // copy constructor
	
		Height h4 = h1.add(h2.add(h3));
		
		
		System.out.println("Sum - " + h4.getCm());
	}

	
}
