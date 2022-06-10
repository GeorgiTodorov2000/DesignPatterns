package abstractfactory;

public abstract class AbstractFactory {
	public abstract Color getColor(String colorName);
	public abstract Shape getShape(String shapeName);
}
