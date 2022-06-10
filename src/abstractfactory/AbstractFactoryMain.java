package abstractfactory;

import java.util.Scanner;

public class AbstractFactoryMain {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What toy do you want type the number: ");
        System.out.println("1. Bike");
        System.out.println("2. Doll");
        int toy = scan.nextInt();
        if(toy == 1) {
            AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
            Shape bike = shapeFactory.getShape("Doll");
            bike.create();

            AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
            Color blue = colorFactory.getColor("BLUE");
            blue.fill();
        } else if(toy == 2) {
            AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
            Shape bike = shapeFactory.getShape("Bike");
            bike.create();

            AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
            Color blue = colorFactory.getColor("BLUE");
            blue.fill();
        } else {
            System.out.println("Toy with that number does not exist");
        }


    }


}
