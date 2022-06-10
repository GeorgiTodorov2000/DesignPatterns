package abstractfactory;

public class ShapeFactory extends AbstractFactory {

	@Override
	public Color getColor(String colorName) {
		// Shape factory... cannot return color
		return null;
	}

	@Override
	public Shape getShape(String shapeName) {
		if(shapeName.equals("Doll")) {
			return new Doll();
		}
		
		if(shapeName.equals("Bike")) {
			return new Bike();
		}
		System.out.println("Unknown shape");
		return null;
	}

}
