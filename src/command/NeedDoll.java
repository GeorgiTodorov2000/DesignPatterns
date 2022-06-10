package command;

import abstractfactory.AbstractFactory;
import abstractfactory.Color;
import abstractfactory.FactoryProducer;
import abstractfactory.Shape;

public class NeedDoll implements Command {
    @Override
    public void execute() {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        Shape bike = shapeFactory.getShape("Doll");
        bike.create();

        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        Color blue = colorFactory.getColor("BLUE");
        blue.fill();
    }
}
