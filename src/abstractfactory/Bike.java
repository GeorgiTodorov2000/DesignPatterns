package abstractfactory;

public class Bike implements Shape {

	@Override
	public void create() {
		System.out.println("Creating a bike");
	}

}
