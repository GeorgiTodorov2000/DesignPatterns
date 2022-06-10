package command;

import abstractfactory.AbstractFactory;
import abstractfactory.Color;
import abstractfactory.FactoryProducer;
import abstractfactory.Shape;

public class NeedBike implements Command {
    @Override
    public void execute() {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        Shape bike = shapeFactory.getShape("Bike");
        bike.create();

        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        Color blue = colorFactory.getColor("BLUE");
        blue.fill();
    }
}
