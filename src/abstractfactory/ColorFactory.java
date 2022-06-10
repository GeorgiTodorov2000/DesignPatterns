package abstractfactory;

public class ColorFactory extends AbstractFactory {

	@Override
	public Color getColor(String colorName) {
		if(colorName.equals("BLUE")) {
			return new Blue();
		}
		
		if(colorName == "GREEN") {
			return new Green();
		}
		System.out.println("Unknown color");
		return null;
	}

	@Override
    public Shape getShape(String shapeName) {
		// Color factory... cannot return shape
		return null;
	}

}
